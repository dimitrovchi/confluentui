package org.dimitrovchi.confluentui.common

import java.util.logging.LogManager

final class NonResettableLogManager extends LogManager {

  super.reset()

  override def reset(): Unit = ()
}
