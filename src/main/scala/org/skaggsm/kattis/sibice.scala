package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/24/2018.
  */
object sibice {
  def main(args: Array[String]): Unit = {
    val Array(matches, w, h) = StdIn.readLine().split(' ').map(_.toInt)

    val maxLengthSquared = w * w + h * h

    (0 until matches).map(_ => StdIn.readInt()).foreach(i =>
      if (i * i > maxLengthSquared)
        println("NE")
      else
        println("DA")
    )
  }
}
