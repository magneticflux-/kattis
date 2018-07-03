package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/3/2018.
  */
object ada {
  def main(args: Array[String]): Unit = {
    val initialSequence = StdIn.readLine.split(' ').toSeq.map(_.toLong).drop(1)

    val derivatives = Iterator.iterate(initialSequence)(finiteDiff)
      .takeWhile(!_.forall(_ == 0))
      .toSeq

    val order = derivatives.tail.size

    val next = derivatives.map(_.last).sum

    println(s"$order $next")
  }

  def finiteDiff(collection: Seq[Long]): Seq[Long] = {
    collection.sliding(2).flatMap { case Seq(a, b) => Some(b - a); case _ => None }.toSeq
  }

}
