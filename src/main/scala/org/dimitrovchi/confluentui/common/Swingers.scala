package org.dimitrovchi.confluentui.common

import java.awt.{Dimension, Point, Rectangle}

import scala.language.implicitConversions

object Swingers {

  implicit def pair2Dimension(p: (Int, Int)): Dimension = new Dimension(p._1, p._2)

  implicit def pair2Point(p: (Int, Int)): Point = new Point(p._1, p._2)

  implicit def pair2Point(p: (Int, Int, Int, Int)): Rectangle = new Rectangle(p._1, p._2, p._3, p._4)
}
