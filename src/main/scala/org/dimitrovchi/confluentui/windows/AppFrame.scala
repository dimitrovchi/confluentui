package org.dimitrovchi.confluentui.windows

import java.awt.BorderLayout

import javax.swing.JFrame
import org.dimitrovchi.confluentui.ui.Dashboard

import scala.swing.Swing._

class AppFrame extends JFrame {
  {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    setTitle("Confluent UI")

    add(new Dashboard, BorderLayout.CENTER)

    setPreferredSize((800, 600))
    pack()
    setLocationRelativeTo(null)
  }
}
