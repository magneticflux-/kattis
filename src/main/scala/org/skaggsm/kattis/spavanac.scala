package org.skaggsm.kattis

import java.time.LocalTime

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object spavanac {
  def main(args: Array[String]): Unit = {
    val Array(h, m) = StdIn.readLine.split(' ').map(_.toInt)

    val newTime = LocalTime.of(h, m).minusMinutes(45)

    println(s"${newTime.getHour} ${newTime.getMinute}")
  }
}
