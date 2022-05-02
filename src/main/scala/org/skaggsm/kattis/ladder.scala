package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object ladder {
  def main(args: Array[String]): Unit = {
    val Array(h, v) = StdIn.readLine().split(' ').map(_.toInt)

    println((h / math.sin(v.toDouble.toRadians)).ceil.round)
  }
}
