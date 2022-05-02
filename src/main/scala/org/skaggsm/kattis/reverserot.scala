package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object reverserot {
  val encoding: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_."

  def main(args: Array[String]): Unit = {
    Iterator.continually(StdIn.readLine())
      .takeWhile(_ != "0")
      .foreach(line => {
        val Array(rotNumberString, stringToRot) = line.split(' ')
        val rotNumber = rotNumberString.toInt

        val decodedLine = stringToRot.reverse.map(c => {
          val newIndex = (encoding.indexOf(c) + rotNumber) % encoding.length
          encoding.charAt(newIndex)
        })

        println(decodedLine)
      })
  }
}
