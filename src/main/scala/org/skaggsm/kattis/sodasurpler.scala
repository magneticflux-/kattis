package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object sodasurpler {
  def main(args: Array[String]): Unit = {
    val Array(e, f, c) = StdIn.readLine().split(' ').map(_.toInt)

    var bottles = e + f
    var drinks = 0

    while (bottles >= c) {
      val newBottles = bottles / c
      drinks += newBottles

      bottles -= newBottles * (c - 1)
    }

    println(drinks)
  }
}
