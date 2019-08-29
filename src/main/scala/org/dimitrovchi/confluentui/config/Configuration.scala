package org.dimitrovchi.confluentui.config

import java.io.File

object Configuration {

  val userHome = new File(sys.props("user.home"))
  val uiHome = new File(userHome, "confluentui")

  uiHome.mkdir()

  val uiHomeProjects = new File(uiHome, "projects")

  uiHomeProjects.mkdir()
}
