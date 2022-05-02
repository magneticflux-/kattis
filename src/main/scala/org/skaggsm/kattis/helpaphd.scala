package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/5/2018.
  */
object helpaphd {
  def main(args: Array[String]): Unit = {
    val numProblems = StdIn.readInt()

    (0 until numProblems).foreach(_ => {
      val line = StdIn.readLine()

      if (line == "P=NP")
        println("skipped")
      else
        println(line.split('+').map(_.toInt).sum)
    })
  }
}
