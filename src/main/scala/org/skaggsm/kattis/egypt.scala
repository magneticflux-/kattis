package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object egypt {
  def main(args: Array[String]): Unit = {
    Iterator.continually(StdIn.readLine())
      .takeWhile(_ != "0 0 0")
      .map(line => {
        val Array(a, b, c) = line.split(' ').map(_.toInt)
        val ordered = Array(a, b, c).sorted

        if (ordered(0) * ordered(0) + ordered(1) * ordered(1) == ordered(2) * ordered(2))
          "right"
        else
          "wrong"
      })
      .foreach(println)
  }
}
