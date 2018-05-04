package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object cetvrta {
  def main(args: Array[String]): Unit = {
    val Array(x1, y1) = StdIn.readLine.split(' ').map(_.toInt)
    val Array(x2, y2) = StdIn.readLine.split(' ').map(_.toInt)
    val Array(x3, y3) = StdIn.readLine.split(' ').map(_.toInt)

    val x4 = if (x1 == x2) x3 else if (x1 == x3) x2 else x1
    val y4 = if (y1 == y2) y3 else if (y1 == y3) y2 else y1

    println(s"$x4 $y4")
  }
}
