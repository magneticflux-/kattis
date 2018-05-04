package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/22/2018.
  */
object oddities {
  def main(args: Array[String]): Unit = {
    val numCases = StdIn.readInt()

    for (_ <- 0 until numCases) {
      val num = StdIn.readInt()
      println(s"$num is ${if (num % 2 == 0) "even" else "odd"}")
    }
  }
}
