package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object dicegame {
  def main(args: Array[String]): Unit = {
    val gunnarScore = StdIn.readLine.split(' ').map(_.toInt).sum
    val emmaScore = StdIn.readLine.split(' ').map(_.toInt).sum

    if (gunnarScore > emmaScore)
      println("Gunnar")
    else if (gunnarScore == emmaScore)
      println("Tie")
    else
      println("Emma")
  }
}
