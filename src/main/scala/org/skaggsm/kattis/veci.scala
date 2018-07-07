package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object veci {
  def main(args: Array[String]): Unit = {
    val x = StdIn.readInt

    val possibilities = x.toString.permutations.toSeq.map(_.toInt).sorted

    val firstLarger = possibilities.collectFirst({ case i if i > x => i })

    firstLarger match {
      case Some(i) => println(i)
      case None => println(0)
    }
  }
}
