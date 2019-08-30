package org.dimitrovchi.confluentui.common

trait CloseableModule extends AutoCloseable {

  protected implicit val closer: ModuleCloser = new ModuleCloser

  override def close(): Unit = {
    closer.close()
  }
}
