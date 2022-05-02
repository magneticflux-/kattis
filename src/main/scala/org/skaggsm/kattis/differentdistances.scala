package org.skaggsm.kattis

import scala.io.StdIn
import scala.math.{abs, pow}

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object differentdistances {
  def main(args: Array[String]): Unit = {
    Iterator.continually(StdIn.readLine())
      .takeWhile(_ != "0")
      .foreach(line => {
        val Array(x1, y1, x2, y2, p) = line.split(' ').map(_.toDouble)

        println(pow(pow(abs(x1 - x2), p) + pow(abs(y1 - y2), p), 1 / p))
      })
  }
}
