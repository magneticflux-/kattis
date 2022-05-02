package org.skaggsm.kattis

import scala.io.StdIn
import scala.math.{Pi, pow}

/**
  * Created by Mitchell Skaggs on 5/5/2018.
  */
object beavergnaw {
  val piSq: Double = pow(Pi, 2)
  val third: Double = 1 / 3d

  def main(args: Array[String]): Unit = {

    Iterator.continually(StdIn.readLine())
      .takeWhile(_ != "0 0")
      .foreach(line => {
        val Array(d, v) = line.split(' ').map(_.toDouble)


        // d = (cbrt(D^(3)π^(3)-6V*π^(2)))/(π)
        val result = pow((pow(d, 3) * Pi - 6 * v) * piSq, third) / Pi

        println(result)
      })
  }
}
