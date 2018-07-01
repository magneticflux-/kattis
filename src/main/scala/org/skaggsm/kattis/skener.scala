package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 6/30/2018.
  */
object skener {
  def main(args: Array[String]): Unit = {
    val Array(rows, cols, zoomRows, zoomCols) = StdIn.readLine.split(' ').map(_.toInt)

    for (_ <- 0 until rows) {
      val line = StdIn.readLine

      val zoomedLine = line.map(List.fill(zoomCols)(_)).flatten.mkString

      for (_ <- 0 until zoomRows)
        println(zoomedLine)
    }
  }
}
