package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object quadrant {
  def main(args: Array[String]): Unit = {
    val x = StdIn.readInt()
    val y = StdIn.readInt()

    if (x > 0 && y > 0)
      println(1)
    else if (x < 0 && y > 0)
      println(2)
    else if (x < 0 && y < 0)
      println(3)
    else if (x > 0 && y < 0)
      println(4)
  }
}
