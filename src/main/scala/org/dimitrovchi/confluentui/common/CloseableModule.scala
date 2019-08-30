package org.dimitrovchi.confluentui.common

trait CloseableModule {

  protected implicit val closer: ModuleCloser = new ModuleCloser
}
