package org.dimitrovchi.confluentui.modules

import org.dimitrovchi.confluentui.ui.Dashboard

trait TabModule {

  implicit def projectName: String

  implicit val dashboard: Dashboard = new Dashboard
}
