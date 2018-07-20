package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/19/2018.
  */
object flyingsafely {
  def main(args: Array[String]): Unit = {
    val testCases = StdIn.readInt

    Stream.continually(StdIn.readLine)
      .take(testCases)
      .foreach(line => {
        val Array(n, m) = line.split(' ').map(_.toInt)

        Stream.continually(StdIn.readLine)
          .take(m)
          .last

        println(n - 1)
      })
  }
}
