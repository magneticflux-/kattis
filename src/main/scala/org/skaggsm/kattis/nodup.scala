package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object nodup {
  def main(args: Array[String]): Unit = {
    val line = StdIn.readLine

    if (line.split(' ') sameElements line.split(' ').distinct)
      println("yes")
    else
      println("no")
  }
}
