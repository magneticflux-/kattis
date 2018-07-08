package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/7/2018.
  */
object rationalsequence2 {
  def main(args: Array[String]): Unit = {
    val cases = StdIn.readInt

    Iterator.continually(StdIn.readLine)
      .take(cases)
      .foreach(line => {
        val Array(num, p, q) = line.split("[ /]").map(_.toInt)

        val node = Node(p, q)

        val directions = Stream.iterate(node)(_.parent)
          .takeWhile(_.hasParent)
          .map(_.direction)

        val binary = directions.map(_ == Right) :+ true


        val location = binary.foldRight(0L)((b, l) => {
          (l << 1) + (if (b) 1 else 0)
        })

        println(s"$num $location")
      })
  }

  sealed trait NodeDirection

  case class Node(p: Int, q: Int) {

    val hasParent: Boolean = p != 1 || q != 1

    val direction: NodeDirection = {
      val hypotheticalParent = (p, q - p)

      if (hypotheticalParent._1 > 0 && hypotheticalParent._2 > 0)
        Left
      else
        Right
    }

    def parent: Node = {
      if (!hasParent)
        throw new UnsupportedOperationException(s"The node $this has no parent!")

      direction match {
        case Left => Node(p, q - p)
        case Right => Node(p - q, q)
      }
    }

    def rightChild: Node = {
      Node(p + q, q)
    }

    def leftChild: Node = {
      Node(p, p + q)
    }

    override def toString: String = s"$p/$q"
  }

  case object Left extends NodeDirection

  case object Right extends NodeDirection

}
