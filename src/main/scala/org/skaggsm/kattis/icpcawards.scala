package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object icpcawards {
  def main(args: Array[String]): Unit = {
    val numTeams = StdIn.readInt()

    (0 until numTeams)
      .map(i => {
        val Array(uni, name) = StdIn.readLine().split(' ')
        (i, uni, name)
      })
      .groupBy(_._2) // Group by uni
      .values
      .map(_.minBy(_._1)) // Take smallest rank num from each uni
      .toSeq
      .sortBy(_._1) // Sort by rank
      .take(12) // Take top 12
      .foreach(p => println(s"${p._2} ${p._3}"))
  }
}
