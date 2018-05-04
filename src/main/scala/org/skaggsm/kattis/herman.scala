package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/4/2018.
  */
object herman {
  def main(args: Array[String]): Unit = {
    val r = StdIn.readDouble

    println(math.Pi * math.pow(r, 2))
    println(2 * math.pow(r, 2))
  }
}
