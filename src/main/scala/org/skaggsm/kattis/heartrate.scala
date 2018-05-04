package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/22/2018.
  */
object heartrate {
  def main(args: Array[String]): Unit = {
    val numCases = StdIn.readInt()

    for (_ <- 1 to numCases) {
      val line = StdIn.readLine().split(' ')

      val b = line(0).toInt
      val p = line(1).toDouble

      val minBeatTime = p / (b + 1)
      val maxBeatTime = p / (b - 1)

      println(s"${60.0 / maxBeatTime} ${60.0 * b / p} ${60.0 / minBeatTime}")
    }
  }
}
