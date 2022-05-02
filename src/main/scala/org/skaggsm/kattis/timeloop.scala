package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object timeloop {
  def main(args: Array[String]): Unit = {
    val times = StdIn.readInt()

    for (i <- 1 to times)
      println(s"$i Abracadabra")

  }
}
