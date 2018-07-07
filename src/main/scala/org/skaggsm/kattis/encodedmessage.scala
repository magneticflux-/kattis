package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 6/30/2018.
  */
object encodedmessage {
  def main(args: Array[String]): Unit = {
    val testCases = StdIn.readInt()

    Iterator.continually(StdIn.readLine)
      .take(testCases)
      .foreach(line => {
        val sideLength = math.sqrt(line.length).round.toInt

        val decoded = for (col <- (0 until sideLength).reverse;
                           row <- 0 until sideLength)
          yield line.charAt(row * sideLength + col)

        println(decoded.mkString)
      })
  }
}
