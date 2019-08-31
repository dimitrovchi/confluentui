package org.dimitrovchi.confluentui.windows

import java.awt.BorderLayout
import java.awt.event.WindowEvent

import javax.swing.{JFrame, WindowConstants}
import org.dimitrovchi.confluentui.common.ModuleCloser
import org.dimitrovchi.confluentui.common.Swingers._
import org.dimitrovchi.confluentui.ui.tabbed.ProjectTabs
import org.dimitrovchi.confluentui.ui.{MainMenu, StatusBar}

class AppFrame(
  implicit val mainMenu: MainMenu,
  implicit val projectTabs: ProjectTabs,
  implicit val statusBar: StatusBar,
  implicit val moduleCloser: ModuleCloser
) extends JFrame {

  setTitle("Confluent UI")
  setJMenuBar(mainMenu)
  setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE)
  add(projectTabs, BorderLayout.CENTER)
  add(statusBar, BorderLayout.SOUTH)
  setPreferredSize((1024, 768))
  pack()
  setLocationRelativeTo(null)

  override def processWindowEvent(e: WindowEvent): Unit = {
    super.processWindowEvent(e)
    e.getID match {
      case WindowEvent.WINDOW_CLOSING => moduleCloser.close()
      case _ =>
    }
  }
}
