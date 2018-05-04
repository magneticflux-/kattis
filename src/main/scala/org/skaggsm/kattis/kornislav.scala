package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object kornislav {
  def main(args: Array[String]): Unit = {
    val lengths = StdIn.readLine.split(' ').map(_.toInt)
    val divisions = lengths.combinations(2).map(subset => (subset, lengths diff subset))

    println(divisions
      .map(p => {
        p._1.min * p._2.min
      })
      .max)
  }
}
