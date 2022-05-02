package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/9/2018.
  */
object patuljci {
  def main(args: Array[String]): Unit = {
    val dwarves = LazyList.continually(StdIn.readInt())
      .take(9)

    val solution = dwarves.combinations(7).find(_.sum == 100)

    solution.transpose
      .flatten
      .foreach(println)
  }
}
