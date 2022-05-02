package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/5/2018.
  */
object railroad2 {
  def main(args: Array[String]): Unit = {
    val Array(_, y) = StdIn.readLine().split(' ').map(_.toInt)

    println(if (y % 2 == 0) "possible" else "impossible")
  }
}
