package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object ostgotska {
  def main(args: Array[String]): Unit = {
    val sentence = StdIn.readLine.split(' ').toSeq

    val words = sentence.size

    val aeWords = sentence.count(_.contains("ae"))

    val ratio = aeWords.toDouble / words.toDouble

    if (ratio >= 0.4)
      println("dae ae ju traeligt va")
    else
      println("haer talar vi rikssvenska")
  }
}
