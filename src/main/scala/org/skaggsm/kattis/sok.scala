package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/7/2018.
  */
object sok {
  def main(args: Array[String]): Unit = {
    val Array(a, b, c) = StdIn.readLine().split(' ').map(_.toInt)
    val Array(i, j, k) = StdIn.readLine().split(' ').map(_.toInt)

    val possibleAUsage = a / i.toDouble
    val possibleBUsage = b / j.toDouble
    val possibleCUsage = c / k.toDouble

    val minUsage = Seq(possibleAUsage, possibleBUsage, possibleCUsage).min

    val actualAUsage = i * minUsage
    val actualBUsage = j * minUsage
    val actualCUsage = k * minUsage

    val aRemaining = a - actualAUsage
    val bRemaining = b - actualBUsage
    val cRemaining = c - actualCUsage

    println(s"$aRemaining $bRemaining $cRemaining")
  }
}
