package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/2/2018.
  */
object tarifa {
  def main(args: Array[String]): Unit = {
    val mbPerMonth = StdIn.readInt
    val numMonths = StdIn.readInt
    var totalUsed = 0
    for (_ <- 0 until numMonths)
      totalUsed += StdIn.readInt

    println(mbPerMonth * (numMonths + 1) - totalUsed)
  }
}
