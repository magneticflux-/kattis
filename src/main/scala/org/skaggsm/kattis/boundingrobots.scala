package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/7/2018.
  */
object boundingrobots {
  def main(args: Array[String]): Unit = {
    Iterator.continually(StdIn.readLine)
      .takeWhile(_ != "0 0")
      .foreach(line => {
        val Array(w, l) = line.split(' ').map(_.toInt)

        val numCommands = StdIn.readInt

        val commands = Iterator.continually(StdIn.readLine)
          .take(numCommands)
          .map(_.split(' '))
          .map {
            case Array("u", num) => Movement(0, num.toInt)
            case Array("d", num) => Movement(0, -num.toInt)
            case Array("r", num) => Movement(num.toInt, 0)
            case Array("l", num) => Movement(-num.toInt, 0)
          }
          .toList

        val robotThinksPosition = commands.foldLeft(Coordinate(0, 0))(_ + _)
        val robotActualPosition = commands.foldLeft(Coordinate(0, 0))((c, m) => {
          val attemptedMove = c + m
          attemptedMove.clip(0 until w, 0 until l)
        })


        println(s"Robot thinks $robotThinksPosition")
        println(s"Actually at $robotActualPosition")
        println()
      })

  }

  case class Movement(dX: Int, dY: Int)

  case class Coordinate(x: Int, y: Int) {
    def clip(xRange: Range, yRange: Range): Coordinate = {
      copy(
        xRange.clip(x),
        yRange.clip(y)
      )
    }

    def +(movement: Movement): Coordinate = copy(x = x + movement.dX, y = y + movement.dY)

    override def toString: String = s"$x $y"
  }

  implicit class RichRange[T](val range: Range) {
    def clip(x: Int): Int = {
      math.max(math.min(x, range.last), range.head)
    }
  }

}
