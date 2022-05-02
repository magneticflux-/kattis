package org.skaggsm.kattis

import scala.io.StdIn
import scala.language.postfixOps

/**
  * Created by Mitchell Skaggs on 7/4/2018.
  */
object stararrangements {
  def main(args: Array[String]): Unit = {
    val numStars = StdIn.readInt()

    println(s"$numStars:")

    val maxRowSize = (numStars + 1) / 2

    val possibilities =
      (for (x <- 2 to maxRowSize view;
            y <- x - 1 to x view)
        yield (x, y))
        .view
        // Must sum to the total
        .filter(p => {
        numStars % (p._1 + p._2) == 0 ||
          (p._1 == p._2 && numStars % p._1 == 0) ||
          ((numStars - p._1) % (p._1 + p._2) == 0)
      })

    possibilities.foreach(p => println(s"${p._1},${p._2}"))
  }
}
