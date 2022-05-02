package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/9/2018.
  */
object aaah {
  def main(args: Array[String]): Unit = {
    val possiblePower = StdIn.readLine().count(_ == 'a')
    val requiredPower = StdIn.readLine().count(_ == 'a')

    if (possiblePower >= requiredPower)
      println("go")
    else
      println("no")
  }
}
