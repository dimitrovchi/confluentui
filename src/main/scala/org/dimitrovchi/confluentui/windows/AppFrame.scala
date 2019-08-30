package org.dimitrovchi.confluentui.windows

import java.awt.BorderLayout
import java.awt.event.WindowEvent

import javax.swing.{JFrame, WindowConstants}
import org.dimitrovchi.confluentui.common.ModuleCloser
import org.dimitrovchi.confluentui.ui.tabbed.ProjectTabs

import scala.swing.Swing._

class AppFrame(
  implicit val projectTabs: ProjectTabs,
  implicit val moduleCloser: ModuleCloser
) extends JFrame {
  {
    setTitle("Confluent UI")
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE)

    add(projectTabs, BorderLayout.CENTER)

    setPreferredSize((800, 600))
    pack()
    setLocationRelativeTo(null)
  }

  override def processWindowEvent(e: WindowEvent): Unit = {
    super.processWindowEvent(e)
    e.getID match {
      case WindowEvent.WINDOW_CLOSING => moduleCloser.close()
      case _ =>
    }
  }
}
