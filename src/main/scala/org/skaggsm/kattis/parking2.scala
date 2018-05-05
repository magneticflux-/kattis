package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/5/2018.
  */
object parking2 {
  def main(args: Array[String]): Unit = {
    val numCases = StdIn.readInt

    (0 until numCases).foreach(_ => {
      val numStores = StdIn.readInt
      val stores = StdIn.readLine.split(' ').map(_.toInt)

      println((stores.max - stores.min) * 2)
    })
  }
}
