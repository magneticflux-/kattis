package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object dicecup {
  def main(args: Array[String]): Unit = {
    val Array(n, m) = StdIn.readLine().split(' ').map(_.toInt)

    val possibleRolls = for (i <- 1 to n; j <- 1 to m)
      yield (i, j)

    val possibleResults = possibleRolls
      .map(p => p._1 + p._2)
      .groupBy(it => it)
      .view.mapValues(_.size).toMap

    val maxOccurrences = possibleResults.values.max

    possibleResults.filter(_._2 == maxOccurrences).keys.toSeq.sorted.foreach(println(_))
  }
}
