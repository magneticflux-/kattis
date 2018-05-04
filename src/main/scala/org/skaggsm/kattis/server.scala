package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object server {
  def main(args: Array[String]): Unit = {
    val Array(count, t) = StdIn.readLine.split(' ').map(_.toInt)

    val tasks = StdIn.readLine.split(' ').toSeq.map(_.toInt)

    println(tasks.inits.find(_.sum <= t).toSeq.flatten.size)
  }
}
