package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object symmetricorder {
  def main(args: Array[String]): Unit = {
    Iterator.continually(StdIn.readInt)
      .takeWhile(_ != 0)
      .zipWithIndex
      .foreach(pair => {
        val (setNum, index) = pair
        println(s"SET ${index + 1}")
        val names = Iterator.continually(StdIn.readLine)
          .take(setNum)
          .toSeq

        val firstGroup = names.sliding(1, 2).map { case Seq(s) => s }.toSeq
        val secondGroup = names.tail.sliding(1, 2).map { case Seq(s) => s }.toSeq

        val combo = firstGroup ++ secondGroup.reverse

        combo.foreach(println)
      })
  }
}
