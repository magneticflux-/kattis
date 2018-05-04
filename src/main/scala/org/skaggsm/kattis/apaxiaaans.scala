package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object apaxiaaans {
  def main(args: Array[String]): Unit = {
    val name = StdIn.readLine

    println(name.replaceAll("(.)\\1+","$1"))
  }
}
