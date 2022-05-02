package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object volim {

  final val MAX_TIME: Int = 60 * 3 + 30
  final val NUM_PLAYERS: Int = 8

  def main(args: Array[String]): Unit = {
    val initialPlayer = StdIn.readInt() - 1
    val numQuestions = StdIn.readInt()

    val events = Iterator.continually(StdIn.readLine())
      .take(numQuestions)
      .map(_.split(' '))
      .map {
        case Array(time, "T") => ResponseEvent(time.toInt, T)
        case Array(time, "N") => ResponseEvent(time.toInt, N)
        case Array(time, "P") => ResponseEvent(time.toInt, P)
      }.toSeq

    val exploded = events.view.scanLeft(GameState())(_ + _).find(_.elapsedTime >= MAX_TIME)

    exploded match {
      case Some(GameState(_, numResponses)) => println(((initialPlayer + numResponses) % NUM_PLAYERS) + 1)
      case _ => throw new MatchError(())
    }
  }

  sealed trait Response

  case class ResponseEvent(duration: Int, response: Response)

  case class GameState(elapsedTime: Int = 0, numResponses: Int = 0) {
    def +(responseEvent: ResponseEvent): GameState = {
      val newElapsed = elapsedTime + responseEvent.duration
      val newResponses = numResponses + (if (responseEvent.response == T && newElapsed < MAX_TIME) 1 else 0)
      copy(newElapsed, newResponses)
    }
  }

  case object T extends Response

  case object N extends Response

  case object P extends Response

}
