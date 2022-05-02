package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object cold {
  def main(args: Array[String]): Unit = {
    StdIn.readInt()

    val temps = StdIn.readLine().split(' ').map(_.toInt)

    println(temps.count(_ < 0))
  }
}
