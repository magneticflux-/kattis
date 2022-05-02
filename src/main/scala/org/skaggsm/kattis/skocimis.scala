package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object skocimis {
  def main(args: Array[String]): Unit = {
    val Array(a, b, c) = StdIn.readLine().split(' ').map(_.toInt)

    val largestGap = math.max(b - a, c - b)

    println(largestGap - 1)
  }
}
