package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object zamka {
  def main(args: Array[String]): Unit = {
    val l = StdIn.readInt
    val d = StdIn.readInt
    val x = StdIn.readInt

    (l to d).find(i => i.toString.grouped(1).map(_.toInt).sum == x) foreach println
    (l to d).reverse.find(i => i.toString.grouped(1).map(_.toInt).sum == x) foreach println
  }
}
