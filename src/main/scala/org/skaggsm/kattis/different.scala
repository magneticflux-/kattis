package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/2/2018.
  */
object different {
  def main(args: Array[String]): Unit = {
    Iterator.continually(StdIn.readLine).takeWhile(_ != null)
      .map(s => {
        val Array(x, y) = s.split(' ').map(_.toLong)
        (x - y).abs
      })
      .foreach(println)
  }
}
