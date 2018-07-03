package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/3/2018.
  */
object lineup {
  def main(args: Array[String]): Unit = {
    val numStudents = StdIn.readInt

    val students = Iterator.continually(StdIn.readLine).take(numStudents).toSeq

    if (students == students.sorted)
      println("INCREASING")
    else if (students == students.sorted.reverse)
      println("DECREASING")
    else
      println("NEITHER")
  }
}
