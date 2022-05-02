package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object textencryption {
  def main(args: Array[String]): Unit = {
    var line = StdIn.readLine()

    while (line != "0") {
      val n = line.toInt
      val plainText = StdIn.readLine()
      val uniformText = plainText.replace(" ", "").toUpperCase
      val length = uniformText.length

      val groupSize = if (length % n == 0) length / n else (length / n) + 1

      println(uniformText
        .grouped(groupSize)
        .map(_.map(Some(_)).padTo(groupSize, None))
        .toList
        .transpose
        .flatten
        .flatten
        .mkString
      )

      line = StdIn.readLine()
    }
  }
}
