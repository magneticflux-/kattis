package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/4/2018.
  */
object boatparts {
  def main(args: Array[String]): Unit = {
    val Array(numParts, numDays) = StdIn.readLine().split(' ').map(_.toInt)

    val replacements = Iterator.continually(StdIn.readLine()).take(numDays).toSeq

    val days = replacements
      .view
      .scanLeft(Set[String]())((set, part) => {
        set + part
      })
      .zipWithIndex

    val replacementDay = days.find(p => p._1.size >= numParts)

    replacementDay match {
      case Some((_, day)) => println(day)
      case None => println("paradox avoided")
    }
  }
}
