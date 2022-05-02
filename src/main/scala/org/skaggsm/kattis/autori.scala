package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object autori {
  def main(args: Array[String]): Unit = {
    println(StdIn.readLine().split('-').map(_.head).mkString)
  }
}
