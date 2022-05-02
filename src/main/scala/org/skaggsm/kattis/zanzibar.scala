package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object zanzibar {
  def main(args: Array[String]): Unit = {
    val count = StdIn.readInt()

    for (_ <- 0 until count) {
      val line = StdIn.readLine().split(' ').map(_.toInt).takeWhile(_ != 0)

      val discrepancies = line.sliding(2)
        .flatMap {
          case Array(a, b) => Some((a, b))
          case _ => None
        }
        .map { case (first, second) => second - first * 2 max 0 }
        .sum

      println(discrepancies)
    }
  }
}
