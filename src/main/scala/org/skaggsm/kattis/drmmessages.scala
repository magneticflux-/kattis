package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/2/2018.
  */
object drmmessages {

  implicit class RichChar(char: Char) {
    def rotate(num: Int): Char = {
      (((char - 'A' + num) % 26) + 'A').toChar
    }
  }

  def main(args: Array[String]): Unit = {
    val line = StdIn.readLine

    val (first, second) = line.splitAt(line.length / 2)

    val firstValue = first.map(_ - 'A').sum
    val secondValue = second.map(_ - 'A').sum

    val firstRot = first.map(_.rotate(firstValue))
    val secondRot = second.map(_.rotate(secondValue))

    val merge = firstRot.zip(secondRot).map(p => p._1.rotate(p._2 - 'A')).mkString

    println(merge)
  }
}
