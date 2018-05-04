package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object filip {
  def main(args: Array[String]): Unit = {
    val Array(first, second) = StdIn.readLine.split(' ')
      .map(_.reverse.toInt)

    println(math.max(first, second))
  }
}
