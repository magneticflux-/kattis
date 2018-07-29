package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/28/2018.
  */
object timebomb {
  val letterMapping: Map[String, Char] = Map(
    ("***\n* *\n* *\n* *\n***", '0'),
    ("  *\n  *\n  *\n  *\n  *", '1'),
    ("***\n  *\n***\n*  \n***", '2'),
    ("***\n  *\n***\n  *\n***", '3'),
    ("* *\n* *\n***\n  *\n  *", '4'),
    ("***\n*  \n***\n  *\n***", '5'),
    ("***\n*  \n***\n* *\n***", '6'),
    ("***\n  *\n  *\n  *\n  *", '7'),
    ("***\n* *\n***\n* *\n***", '8'),
    ("***\n* *\n***\n  *\n***", '9'),
  )

  def main(args: Array[String]): Unit = {
    val grid: Seq[Seq[Char]] = Seq.fill(5)(StdIn.readLine.seq :+ ' ').seq

    val letters = grid.transpose.grouped(4).toSeq.map {
      case Seq(x, y, z, _) => Seq(x, y, z).transpose.map(_.mkString).mkString("\n")
    }

    val chars = letters.map(letterMapping.get)

    if (chars.forall(_.isDefined) && chars.flatten.mkString.toInt % 6 == 0)
      println("BEER!!")
    else
      println("BOOM!!")
  }
}
