package org.skaggsm.kattis

import java.time.LocalDate

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object datum {
  def main(args: Array[String]): Unit = {
    val Array(dayOfMonth, monthOfYear) = StdIn.readLine().split(' ').map(_.toInt)
    println(
      LocalDate.of(2009, monthOfYear, dayOfMonth)
        .getDayOfWeek
        .toString.toLowerCase.capitalize
    )
  }
}
