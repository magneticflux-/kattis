package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object mixedfractions {
  def main(args: Array[String]): Unit = {
    Iterator.continually(StdIn.readLine)
      .takeWhile(_ != "0 0")
      .map(line => {
        val Array(n, d) = line.split(' ').map(_.toInt)

        val whole = n / d
        val remainder = n % d

        s"$whole $remainder / $d"

      })
      .foreach(println)
  }
}
