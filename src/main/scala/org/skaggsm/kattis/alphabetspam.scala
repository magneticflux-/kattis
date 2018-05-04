package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/4/2018.
  */
object alphabetspam {
  def main(args: Array[String]): Unit = {
    val line = StdIn.readLine
    val length = line.length.toDouble
    val numWhitespace = line.count(_ == '_')
    val numLowercase = line.count(_.isLower)
    val numUppercase = line.count(_.isUpper)
    val numSymbols = line.count(c => !c.isLower && !c.isUpper && c != '_')

    println(numWhitespace / length)
    println(numLowercase / length)
    println(numUppercase / length)
    println(numSymbols / length)
  }
}
