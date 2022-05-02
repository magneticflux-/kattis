package org.skaggsm.kattis

import scala.collection.mutable
import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object trainsorting {
  def main(args: Array[String]): Unit = {
    val count = StdIn.readInt()

    val trains = mutable.ArraySeq[Int](count)

    for (i <- 0 until count)
      trains.update(i, StdIn.readInt())


  }
}
