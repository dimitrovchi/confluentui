package org.dimitrovchi.confluentui.remote

import java.net.URL

object ConfluentVersion extends Enumeration {

  protected case class Val(ver: String) extends super.Val {
    def url(scalaVer: String): URL = {
      val verParts = ver.split("\\.")
      val major = verParts(0) + "." + verParts(1)
      new URL(s"http://packages.confluent.io/archive/${major}/confluent-${ver}-${scalaVer}.zip")
    }
  }

  val `5.0.0` = Val("5.0.0")
  val `5.1.1` = Val("5.1.0")
  val `5.2.0` = Val("5.2.0")
  val `5.2.1` = Val("5.2.1")
  val `5.3.0` = Val("5.3.0")
}
