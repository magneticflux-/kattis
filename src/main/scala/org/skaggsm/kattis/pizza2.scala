package org.skaggsm.kattis

import scala.io.StdIn
import scala.math.{Pi, pow}

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object pizza2 {
  def main(args: Array[String]): Unit = {
    val Array(r, c) = StdIn.readLine.split(' ').map(_.toInt)

    val innerRadius = r - c

    val totalArea = Pi * pow(r, 2)
    val cheeseArea = Pi * pow(innerRadius, 2)

    println(100 * (cheeseArea / totalArea))
  }
}
