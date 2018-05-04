package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object simonsays {
  def main(args: Array[String]): Unit = {
    val count = StdIn.readInt()

    for (_ <- 0 until count) {
      val line = StdIn.readLine

      if (line.startsWith("Simon says"))
        println(line.substring(10))
    }
  }
}
