package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/4/2018.
  */
object cups {
  def main(args: Array[String]): Unit = {
    val numCups = StdIn.readInt

    (0 until numCups)
      .map(_ => {
        val Array(first, second) = StdIn.readLine.split(' ')
        (first, second)
      })
      .map {
        case (num, color) if num(0).isDigit => (color, num.toDouble / 2)
        case (color, num) => (color, num.toDouble)
      }
      .sortBy(_._2)
      .map(_._1)
      .foreach(println(_))
  }
}
