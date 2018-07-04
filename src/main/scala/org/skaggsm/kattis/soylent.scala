package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/4/2018.
  */
object soylent {
  def main(args: Array[String]): Unit = {
    val cases = StdIn.readInt

    Iterator.continually(StdIn.readInt).take(cases)
      .map(c => (c + 399) / 400)
      .foreach(println)
  }
}
