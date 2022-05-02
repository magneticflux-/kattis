package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object parking {
  def main(args: Array[String]): Unit = {
    val Array(a, b, c) = StdIn.readLine().split(' ').map(_.toInt)
    val Array(x1, y1) = StdIn.readLine().split(' ').map(_.toInt)
    val Array(x2, y2) = StdIn.readLine().split(' ').map(_.toInt)
    val Array(x3, y3) = StdIn.readLine().split(' ').map(_.toInt)

    val ranges = Seq(x1 until y1, x2 until y2, x3 until y3)

    val costs = Array(0, a, b, c)

    val timeSlices = Seq(x1, y1, x2, y2, x3, y3).sorted.sliding(2)

    val totalCost = timeSlices.map { case Seq(x, y) => x until y }
      .map(range => {
        val numTrucks = ranges.count(_.intersect(range).nonEmpty)

        range.length * numTrucks * costs(numTrucks)
      })
      .sum

    println(totalCost)
  }
}
