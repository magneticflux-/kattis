package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/25/2018.
  */
object erase {
  val toBits: Char => Boolean = {
    case '1' => true
    case '0' => false
  }

  def main(args: Array[String]): Unit = {
    val writes = StdIn.readInt()
    val writesIsOdd = writes % 2 == 1

    val beforeFile = StdIn.readLine().map(toBits)
    val afterFile = StdIn.readLine().map(toBits)

    val expectedAfterFile = beforeFile.map(_ ^ writesIsOdd)

    if (afterFile == expectedAfterFile)
      println("Deletion succeeded")
    else
      println("Deletion failed")
  }
}
