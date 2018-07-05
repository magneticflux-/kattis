package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object quickestimate {
  def main(args: Array[String]): Unit = {
    val numCosts = StdIn.readInt

    Iterator.continually(StdIn.readLine)
      .take(numCosts)
      .map(_.length)
      .foreach(println)
  }
}
