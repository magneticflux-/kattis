package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 6/30/2018.
  */
object ptice {
  def main(args: Array[String]): Unit = {
    val numQuestions = StdIn.readInt
    val answers = StdIn.readLine


    val attempts = Seq(
      "Adrian" -> Stream.continually("ABC").flatten.take(numQuestions),
      "Bruno" -> Stream.continually("BABC").flatten.take(numQuestions),
      "Goran" -> Stream.continually("CCAABB").flatten.take(numQuestions)
    )

    val results = attempts.map(attempt => attempt.copy(_2 = attempt._2.zip(answers).count(pair => pair._1 == pair._2)))

    val maxScore = results.map(_._2).max

    val winners = results.filter(_._2 == maxScore).map(_._1).sorted

    println(maxScore)
    winners.foreach(println)
  }
}
