package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/29/2018.
  */
object compoundwords {
  def main(args: Array[String]): Unit = {
    val words = Stream.continually(StdIn.readLine)
      .takeWhile(s => s != null && s.nonEmpty)
      .flatMap(_.split(' '))

    val compoundWords = words.combinations(2).flatMap { case Stream(a, b) => Seq(s"$a$b", s"$b$a") }.toSeq

    compoundWords.distinct.sorted.foreach(println)
  }
}
