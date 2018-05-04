package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object quickbrownfox {
  def main(args: Array[String]): Unit = {
    val count = StdIn.readInt()

    val alphabet = "abcdefghijklmnopqrstuvwxyz".toSet

    for (_ <- 0 until count) {
      val lineChars = StdIn.readLine.filter(_.isLetter).toLowerCase.toSet

      val diff = alphabet -- lineChars

      if (diff.isEmpty)
        println("pangram")
      else
        println(s"missing ${diff.toList.sorted.mkString}")
    }
  }
}
