package org.skaggsm.kattis

import scala.io.StdIn
import scala.math._

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object racingalphabet {
  val encoding: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '"

  val circleDiameter: Double = 60
  val circleCircumference: Double = Pi * circleDiameter
  val distancePerSpace: Double = circleCircumference / 28
  val timePerDistance: Double = 1 / 15d

  val timePerSpace: Double = timePerDistance * distancePerSpace
  val timePerPickup: Double = 1


  def main(args: Array[String]): Unit = {
    val numAphorisms = StdIn.readInt

    Iterator.continually(StdIn.readLine)
      .take(numAphorisms)
      .map(line => {
        val pickupTime = line.length * timePerPickup
        val runningTime = line.sliding(2)
          .map(pair => {
            val Array(start, end) = pair.toCharArray

            val startPosition = encoding.indexOf(start)
            val endPosition = encoding.indexOf(end)

            val distance = abs(startPosition - endPosition)

            min(
              distance, // "Forward"
              encoding.length - distance // "Backward"
            ) * timePerSpace

          }).sum

        pickupTime + runningTime
      })
      .foreach(println)
  }
}
