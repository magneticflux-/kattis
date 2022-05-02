package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/2/2018.
  */
object tetration {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readDouble()

    println(math.pow(n, 1 / n))
  }
}
