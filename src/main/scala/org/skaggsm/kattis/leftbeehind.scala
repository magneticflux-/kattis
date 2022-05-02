package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/28/2018.
  */
object leftbeehind {
  def main(args: Array[String]): Unit = {
    LazyList.continually(StdIn.readLine())
      .takeWhile(_ != "0 0")
      .map(l => {
        val Array(sweet, sour) = l.split(' ').map(_.toInt)

        if (sweet + sour == 13)
          "Never speak again."
        else if (sweet > sour)
          "To the convention."
        else if (sweet < sour)
          "Left beehind."
        else
          "Undecided."
      })
      .foreach(println)
  }
}
