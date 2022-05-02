package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/4/2018.
  */
object oddmanout {
  def main(args: Array[String]): Unit = {
    val numCases = StdIn.readInt()

    (1 to numCases).foreach(caseNum => {
      StdIn.readInt()
      val numbers = StdIn.readLine().split(' ').map(_.toInt)
      val occurances = numbers.groupBy(i => i).view.mapValues(_.length)
      occurances.find(_._2 == 1).map(_._1).foreach(i => println(s"Case #$caseNum: $i"))
    })
  }
}
