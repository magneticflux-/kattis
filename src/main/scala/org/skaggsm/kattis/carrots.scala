package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object carrots {
  def main(args: Array[String]): Unit = {
    val Array(_, solved) = StdIn.readLine.split(' ').map(_.toInt)

    println(solved)
  }
}
