package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/7/2018.
  */
object rationalsequence {
  def main(args: Array[String]): Unit = {
    val cases = StdIn.readInt()

    Iterator.continually(StdIn.readLine())
      .take(cases)
      .foreach(line => {
        val Array(num, p, q) = line.split("[ /]").map(_.toInt)

        val node = Node(p, q)

        LazyList.iterate(node)(_.parent)
          .takeWhile(_.hasParent)
          .map(_.direction)

        println(s"$num: $node ${node.direction}")
      })
  }

  sealed trait NodeDirection

  case class Node(p: Long, q: Long) {

    val hasParent: Boolean = p != 1 || q != 1

    val direction: NodeDirection = {
      val hypotheticalParent = (p, q - p)

      if (hypotheticalParent._1 > 0 && hypotheticalParent._2 > 0)
        Left
      else
        Right
    }

    def parent: Node = {
      if (hasParent)
        direction match {
          case Left => Node(p, q - p)
          case Right => Node(p - q, q)
        }
      else
        throw new UnsupportedOperationException(s"The node $this has no parent!")
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
