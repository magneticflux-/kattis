package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/2/2018.
  */
object carefulascent {
  def main(args: Array[String]): Unit = {
    val Array(fX, fY) = StdIn.readLine.split(' ').map(_.toDouble)
    val numShields = StdIn.readInt
    val shields = (0 until numShields)
      .map(_ => StdIn.readLine)
      .map(s => {
        val Array(low, high, factor) = s.split(' ')
        Shield(low.toInt, high.toInt, factor.toDouble)
      })

    val timeToReach = fY
    val unShieldedAirFactor = fY - shields.map(_.distance).sum
    val shieldedAirFactor = shields.map(s => s.distance * s.factor).sum

    val adjustedHorizontalDistance = unShieldedAirFactor + shieldedAirFactor

    println(fX / adjustedHorizontalDistance)

  }

  case class Shield(low: Int, high: Int, factor: Double) {
    def distance: Int = high - low
  }

}
