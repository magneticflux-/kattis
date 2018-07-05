package org.skaggsm.kattis

import scala.io.StdIn
import scala.language.postfixOps

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object synchronizinglists {
  def main(args: Array[String]): Unit = {
    Iterator.continually(StdIn.readInt)
      .takeWhile(_ != 0)
      .foreach(listSize => {

        val (firstList, secondList) = Iterator.continually(StdIn.readInt).take(2 * listSize).toList.splitAt(listSize)

        val mapping = firstList.sorted.zip(secondList.sorted).toMap

        firstList
          .map(mapping(_))
          .foreach(println)

        println
      })
  }
}
