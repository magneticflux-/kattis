package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/5/2018.
  */
object kemija08 {
  def main(args: Array[String]): Unit = {
    println(StdIn.readLine.replaceAll("([aeiou])p\\1", "$1"))
  }
}
