package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object conundrum {
  def main(args: Array[String]): Unit = {
    val original = StdIn.readLine
    println(original.zip(Stream.continually("PER").flatten.take(original.length)).count(p => p._1 != p._2))
  }
}
