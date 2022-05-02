package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/7/2018.
  */
object rijeci {
  def main(args: Array[String]): Unit = {
    val k = StdIn.readInt()

    val finalState = Iterator.iterate(State(1, 0))(_.advance())
      .take(k + 1)
      .toSeq
      .last

    println(s"$finalState")
  }

  case class State(a: Int, b: Int) {
    def advance(): State = {
      val newA = b
      val newB = b + a

      copy(newA, newB)
    }

    override def toString: String = s"$a $b"
  }

}
