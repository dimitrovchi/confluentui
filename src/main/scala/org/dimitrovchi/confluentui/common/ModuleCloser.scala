package org.dimitrovchi.confluentui.common

import scala.collection.mutable

final class ModuleCloser extends AutoCloseable {

  private val closeables = new mutable.ArrayDeque[AutoCloseable]()

  def register(closeable: AutoCloseable): Unit = {
    closeables += closeable
  }

  override def close(): Unit = {
    var exception: Throwable = null
    for (closeable <- closeables.reverseIterator) {
      try {
        closeable.close()
      } catch {
        case e: Throwable =>
          if (exception == null) {
            exception = e
          } else {
            exception.addSuppressed(e)
          }
      }
    }
    if (exception != null) {
      throw exception
    }
  }
}
