package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/2/2018.
  */
object grassseed {
  def main(args: Array[String]): Unit = {
    val cost = StdIn.readDouble
    val numLawns = StdIn.readInt
    var total = 0d

    for (_ <- 0 until numLawns) {
      val Array(l, w) = StdIn.readLine.split(' ').map(_.toDouble)
      total += l * w * cost
    }

    println(total)
  }
}
