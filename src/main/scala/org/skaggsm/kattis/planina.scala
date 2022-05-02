package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object planina {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()

    // ( -2^n + 2^(n+1) + 1 )^2

    val result = (-BigInt(2).pow(n) + BigInt(2).pow(n + 1) + 1).pow(2)

    println(result)
  }
}
