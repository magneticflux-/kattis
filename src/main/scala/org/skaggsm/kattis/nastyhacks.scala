package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object nastyhacks {
  def main(args: Array[String]): Unit = {
    val cases = StdIn.readInt()

    for (_ <- 0 until cases) {
      val Array(r, e, c) = StdIn.readLine().split(' ').map(_.toInt)

      // Positive if no advertise is better, zero if doesn't matter, negative if advertise is better
      r - (e - c) match {
        case x if x > 0 => println("do not advertise")
        case x if x == 0 => println("does not matter")
        case x if x < 0 => println("advertise")
      }
    }
  }
}
