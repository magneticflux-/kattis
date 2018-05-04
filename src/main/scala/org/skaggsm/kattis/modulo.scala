package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object modulo {
  def main(args: Array[String]): Unit = {
    println((0 until 10).map(_ => StdIn.readInt()).map(_ % 42).distinct.size)
  }
}
