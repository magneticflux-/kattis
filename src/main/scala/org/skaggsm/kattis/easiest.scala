package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/8/2018.
  */
object easiest {
  def main(args: Array[String]): Unit = {
    var line = StdIn.readLine()

    while (line != null && line != "0") {
      val n = line.toInt
      val sum = sumDigits(n)

      (11 to 100).find(i => sum == sumDigits(i * n)) foreach println

      line = StdIn.readLine()
    }
  }

  def sumDigits(int: Int): Int = int.toString.map(_ - '0').sum
}
