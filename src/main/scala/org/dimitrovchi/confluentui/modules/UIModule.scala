package org.dimitrovchi.confluentui.modules

import org.dimitrovchi.confluentui.common.CloseableModule
import org.dimitrovchi.confluentui.ui.{MainMenu, StatusBar}
import org.dimitrovchi.confluentui.ui.tabbed.ProjectTabs
import org.dimitrovchi.confluentui.windows.AppFrame

trait UIModule extends CloseableModule {

  implicit val mainMenu: MainMenu = new MainMenu

  implicit val statusBar: StatusBar = new StatusBar

  implicit val projectTabs: ProjectTabs = new ProjectTabs

  implicit val appFrame: AppFrame = new AppFrame
}
