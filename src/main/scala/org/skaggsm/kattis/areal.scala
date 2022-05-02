package org.skaggsm.kattis

import scala.io.StdIn
import scala.math.sqrt

/**
  * Created by Mitchell Skaggs on 7/29/2018.
  */
object areal {
  def main(args: Array[String]): Unit = {
    val area = StdIn.readLong()
    val sideLength = sqrt(area.toDouble)
    val perimeter = sideLength * 4

    println(perimeter)
  }
}
