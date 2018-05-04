package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object detaileddifferences {
  def main(args: Array[String]): Unit = {
    val numCases = StdIn.readInt

    0 until numCases foreach (_ => {
      val s1 = StdIn.readLine
      val s2 = StdIn.readLine

      println(s1)
      println(s2)
      println(s1.zip(s2)
        .map {
          case (c1, c2) if c1 == c2 => '.'
          case _ => '*'
        }.mkString)
      println
    })
  }
}
