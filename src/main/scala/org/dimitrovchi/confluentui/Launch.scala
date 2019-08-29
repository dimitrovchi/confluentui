package org.dimitrovchi.confluentui

import javax.swing.plaf.nimbus.NimbusLookAndFeel
import javax.swing.{SwingUtilities, UIManager}
import org.dimitrovchi.confluentui.windows.AppFrame

object Launch {

  def main(args: Array[String]): Unit = {
    UIManager.setLookAndFeel(new NimbusLookAndFeel)
    SwingUtilities.invokeLater(() => new AppFrame().setVisible(true))
  }
}
