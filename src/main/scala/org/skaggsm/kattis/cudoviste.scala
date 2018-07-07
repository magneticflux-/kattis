package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/7/2018.
  */
object cudoviste {
  def main(args: Array[String]): Unit = {
    val Array(rows, cols) = StdIn.readLine.split(' ').map(_.toInt)

    val grid = Iterator.continually(StdIn.readLine)
      .map(_.toArray)
      .take(rows)
      .toArray

    val targets = for (row <- 0 until rows - 1;
                       col <- 0 until cols - 1) yield Seq((row, col), (row + 1, col), (row, col + 1), (row + 1, col + 1))

    val results = targets
      .flatMap(s => {
        val crushed = s.map { case (r, c) => grid(r)(c) }

        if (crushed.contains('#'))
          None
        else
          Some(crushed.count(_ == 'X'))
      })
      .groupBy(i => i)
      .mapValues(_.size)
      .withDefaultValue(0)

    (0 to 4)
      .map(results(_))
      .foreach(println)
  }
}
