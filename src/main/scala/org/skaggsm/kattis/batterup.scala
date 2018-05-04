package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object batterup {
  def main(args: Array[String]): Unit = {
    val count = StdIn.readInt

    val countedBats = StdIn.readLine.split(' ').map(_.toInt).filter(_ >= 0)
    println(countedBats.sum.toDouble / countedBats.length)
  }
}
