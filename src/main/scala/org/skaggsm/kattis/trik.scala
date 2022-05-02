package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/4/2018.
  */
object trik {
  def main(args: Array[String]): Unit = {
    val line = StdIn.readLine()

    val cups = Array.range(1, 4)

    line.foreach {
      case 'A' =>
        val temp = cups(0)
        cups(0) = cups(1)
        cups(1) = temp
      case 'B' =>
        val temp = cups(1)
        cups(1) = cups(2)
        cups(2) = temp
      case 'C' =>
        val temp = cups(0)
        cups(0) = cups(2)
        cups(2) = temp
    }

    println(cups.indexOf(1) + 1)
  }
}
