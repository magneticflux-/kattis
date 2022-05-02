package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object fizzbuzz {
  def main(args: Array[String]): Unit = {
    val Array(x, y, n) = StdIn.readLine().split(' ').map(_.toInt)

    for (i <- 1 to n) {
      println(
        i match {
          case a if a % x == 0 && a % y == 0 => "FizzBuzz"
          case a if a % x == 0 => "Fizz"
          case a if a % y == 0 => "Buzz"
          case a => a
        }
      )
    }
  }
}
