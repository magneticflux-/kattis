package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/4/2018.
  */
object judgingmoose {
  def main(args: Array[String]): Unit = {
    val Array(l, r) = StdIn.readLine().split(' ').map(_.toInt)

    if (l == 0 && r == 0)
      println("Not a moose")
    else {
      val odd = l != r
      println(
        s"${if (odd) "Odd" else "Even"} ${(l max r) * 2}"
      )
    }
  }
}
