package org.dimitrovchi.confluentui.windows

import java.awt.BorderLayout

import javax.swing.JFrame
import org.dimitrovchi.confluentui.ui.tabbed.ProjectTabs

import scala.swing.Swing._

class AppFrame
(
  implicit val projectTabs: ProjectTabs
) extends JFrame {
  {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    setTitle("Confluent UI")

    add(projectTabs, BorderLayout.CENTER)

    setPreferredSize((800, 600))
    pack()
    setLocationRelativeTo(null)
  }
}
