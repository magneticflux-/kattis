package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object justaminute {
  def main(args: Array[String]): Unit = {
    val numSamples = StdIn.readInt

    val Seq(m, s) = Iterator.continually(StdIn.readLine)
      .take(numSamples)
      .map(_.split(' ').map(_.toInt))
      .toSeq
      .transpose

    val ratio = s.sum.toDouble / m.map(_ * 60).sum

    if (ratio > 1)
      println(ratio)
    else
      println("measurement error")
  }
}
