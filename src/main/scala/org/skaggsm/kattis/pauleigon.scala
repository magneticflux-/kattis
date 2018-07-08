package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/7/2018.
  */
object pauleigon {
  def main(args: Array[String]): Unit = {
    val Array(n, p, q) = StdIn.readLine.split(' ').map(_.toInt)

    val currentRound = p + q

    val numSwitches = currentRound / n

    if (numSwitches % 2 == 0)
      println("paul")
    else
      println("opponent")
  }
}
