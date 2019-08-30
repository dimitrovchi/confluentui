package org.dimitrovchi.confluentui.common

import com.typesafe.scalalogging.LazyLogging

import scala.collection.mutable

final class ModuleCloser extends AutoCloseable with LazyLogging {

  private val closeables = new mutable.ArrayDeque[AutoCloseable]()

  def register(closeable: AutoCloseable): Unit = {
    closeables += closeable
  }

  override def close(): Unit = {
    logger.info("Closing {}", this)
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
      logger.warn("An exception occurred", exception)
    }
  }
}
