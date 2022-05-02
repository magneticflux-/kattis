package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object bus {
  def main(args: Array[String]): Unit = {
    val cases = StdIn.readInt()

    Iterator.continually(StdIn.readInt())
      .take(cases)
      .map(i => {
        (0 until i)
          .map(_.toDouble)
          .fold(0d)((a: Double, _) => {
            (a + 0.5) * 2
          })
          .round
      })
      .foreach(println)
  }
}
