package org.dimitrovchi.confluentui

import javax.swing.plaf.nimbus.NimbusLookAndFeel
import javax.swing.{SwingUtilities, UIManager}
import org.dimitrovchi.confluentui.common.NonResettableLogManager
import org.dimitrovchi.confluentui.modules.UIModule
import org.slf4j.bridge.SLF4JBridgeHandler

object Launch {

  def main(args: Array[String]): Unit = {
    System.setProperty("java.util.logging.manager", classOf[NonResettableLogManager].getName)
    SLF4JBridgeHandler.install()
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
