package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object speedlimit {
  def main(args: Array[String]): Unit = {
    var numEntries = StdIn.readInt()
    while (numEntries != -1) {
      val entries = (0, 0) +: (0 until numEntries)
        .map(_ => {
          val Array(speed, totalTime) = StdIn.readLine().split(' ').map(_.toInt)
          (speed, totalTime)
        })

      val miles = entries.tail
        .zip(entries)
        .map(entryPair => {
          entryPair._1._1 * (entryPair._1._2 - entryPair._2._2)
        })
        .sum

      println(s"$miles miles")

      numEntries = StdIn.readInt()
    }
  }
}
