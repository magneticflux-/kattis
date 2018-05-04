package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object everywhere {
  def main(args: Array[String]): Unit = {
    val cases = StdIn.readInt

    for (_ <- 0 until cases) {
      val trips = StdIn.readInt

      val cities = for (_ <- 0 until trips) yield StdIn.readLine

      println(cities.distinct.size)
    }
  }
}
