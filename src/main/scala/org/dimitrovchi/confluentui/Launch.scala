package org.dimitrovchi.confluentui

import javax.swing.plaf.nimbus.NimbusLookAndFeel
import javax.swing.{SwingUtilities, UIManager}
import org.dimitrovchi.confluentui.modules.UIModule

object Launch {

  def main(args: Array[String]): Unit = {
    UIManager.setLookAndFeel(new NimbusLookAndFeel)
    SwingUtilities.invokeLater(() => {
      val module = new LaunchModule
      module.appFrame.setVisible(true)
    })
  }

  private final class LaunchModule
    extends UIModule {
  }
}
