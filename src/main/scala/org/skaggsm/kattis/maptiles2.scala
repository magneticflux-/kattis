package org.skaggsm.kattis

import java.lang.Long

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object maptiles2 {
  def main(args: Array[String]): Unit = {
    val quadKeyString = StdIn.readLine
    val quadKey = Long.parseLong(quadKeyString, 4)

    val zoomLevel = quadKeyString.length

    val quadKeyBinary = quadKey.toBinaryString.reverse.padTo(zoomLevel * 2, '0').reverse

    val Stream(y, x) = quadKeyBinary.grouped(2).toSeq.transpose.map(s => Long.parseLong(s.mkString, 2))

    println(s"$zoomLevel $x $y")
  }
}
