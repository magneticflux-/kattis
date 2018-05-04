package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/22/2018.
  */
object twostones {
  def main(args: Array[String]): Unit = {
    val stones = StdIn.readInt()

    if (stones % 2 == 0)
      println("Bob")
    else
      println("Alice")
  }
}
