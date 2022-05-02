package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/24/2018.
  */
object reversebinary {
  def main(args: Array[String]): Unit = {
    println(Integer.parseInt(StdIn.readInt().toBinaryString.reverse, 2))
  }
}
