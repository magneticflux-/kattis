package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object oddgnome {
  def main(args: Array[String]): Unit = {
    val cases = StdIn.readInt

    Iterator.continually(StdIn.readLine)
      .take(cases)
      .map(line => {
        line.split(' ')
          .toSeq
          .map(_.toInt)
          .tail
          .sliding(2)
          .indexWhere { case Seq(x, y) => x + 1 != y } + 2
      })
      .foreach(println)
  }
}
