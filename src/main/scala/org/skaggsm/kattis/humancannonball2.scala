package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/4/2018.
  */
object humancannonball2 {
  val G = 9.81

  def main(args: Array[String]): Unit = {
    val numCases = StdIn.readInt()
    (0 until numCases).foreach(_ => {
      val Array(v, theta, x, h1, h2) = StdIn.readLine().split(' ').map(_.toDouble)

      val vX = v * math.cos(theta.toRadians)
      val vY = v * math.sin(theta.toRadians)

      val t = x / vX

      val y = t * vY -.5 * G * math.pow(t, 2)

      if (h1 + 1 < y && y < h2 - 1)
        println("Safe")
      else
        println("Not Safe")
    })
  }
}
