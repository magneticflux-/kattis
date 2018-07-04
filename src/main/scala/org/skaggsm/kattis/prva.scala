package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/4/2018.
  */
object prva {
  def main(args: Array[String]): Unit = {
    val Array(r, _) = StdIn.readLine.split(' ').map(_.toInt)

    val grid = Iterator.continually(StdIn.readLine).take(r).toSeq

    val words = grid.flatMap(_.mkString.split('#')) ++ grid.transpose.flatMap(_.mkString.split('#')) filter (_.length > 1)

    println(words.min)
  }
}
