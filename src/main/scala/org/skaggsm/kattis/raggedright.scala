package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/7/2018.
  */
object raggedright {
  def main(args: Array[String]): Unit = {
    val lines = Iterator.continually(StdIn.readLine())
      .takeWhile(line => line != null && line.nonEmpty)
      .toSeq

    val maxLength = lines.map(_.length).max

    val score = lines.init.map(line => {
      val t = maxLength - line.length
      t * t
    }).sum

    println(score)

  }
}
