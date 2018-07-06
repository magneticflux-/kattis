package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object acm {
  def main(args: Array[String]): Unit = {
    val log = Iterator.continually(StdIn.readLine)
      .takeWhile(_ != "-1")
      .map(line => {
        val Array(time, problem, correct) = line.split(' ')
        LogEntry(time.toInt, problem.head, correct == "right")
      })
      .toSeq

    val correct = log.filter(_.correct)

    val solved = correct.map(_.problem).toSet

    val primaryScore = solved.size

    val secondaryScore = correct.map(_.time).sum + log.count(e => !e.correct && solved.contains(e.problem)) * 20

    println(s"$primaryScore $secondaryScore")
  }

  case class LogEntry(time: Int, problem: Char, correct: Boolean)

}
