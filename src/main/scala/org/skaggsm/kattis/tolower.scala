package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/12/2018.
  */
object tolower {
  def main(args: Array[String]): Unit = {
    val Array(p, t) = StdIn.readLine.split(' ').map(_.toInt)

    val correct = Stream.continually(StdIn.readLine)
      .take(p * t)
      .grouped(t)
      .count(_.forall(_.tail.forall(_.isLower)))

    println(correct)
  }
}
