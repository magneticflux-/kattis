package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/3/2018.
  */
object sumkindofproblem {
  def main(args: Array[String]): Unit = {
    val numSets = StdIn.readInt

    Iterator.continually(StdIn.readLine)
      .take(numSets)
      .map(_.split(' ').map(_.toInt))
      .map { case Array(a, b) => (a, b) }
      .foreach(pair => {
        val datasetNumber = pair._1
        val n = pair._2

        val sumFirstN = (n * (n + 1)) / 2
        val sumFirstNEven = sumFirstN * 2
        val sumFirstNOdd = sumFirstNEven - n

        println(s"$datasetNumber $sumFirstN $sumFirstNOdd $sumFirstNEven")
      })
  }
}
