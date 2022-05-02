package org.skaggsm.kattis

import java.lang.Long.parseLong
import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object maptiles2 {
  def main(args: Array[String]): Unit = {
    val quadKeyString = StdIn.readLine()
    val quadKey = parseLong(quadKeyString, 4)

    val zoomLevel = quadKeyString.length

    val quadKeyBinary = quadKey.toBinaryString.reverse.padTo(zoomLevel * 2, '0').reverse

    val Seq(y, x) = quadKeyBinary.grouped(2).toSeq.transpose.map(s => parseLong(s.mkString, 2))

    println(s"$zoomLevel $x $y")
  }
}
