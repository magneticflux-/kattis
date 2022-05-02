package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object pet {
  def main(args: Array[String]): Unit = {
    val contestants = for (i <- 1 to 5) yield (i, StdIn.readLine().split(' ').map(_.toInt).sum)

    println(contestants.maxBy(_._2).productIterator.mkString(" "))
  }
}
