package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/28/2018.
  */
object nineknights {
  def main(args: Array[String]): Unit = {
    val board: Seq[Seq[Boolean]] = Seq.fill(5)(StdIn.readLine()).map(_.map {
      case 'k' => true
      case '.' => false
    })

    val knightSet = board.zipWithIndex
      .flatMap {
        case (row, rowNum) => row.zipWithIndex.flatMap {
          case (true, colNum) => Some(Knight(rowNum, colNum))
          case _ => None
        }
      }
      .toSet

    val valid = knightSet.size == 9 && knightSet.forall(knight => (knight.moves & knightSet).isEmpty)

    if (valid)
      println("valid")
    else
      println("invalid")
  }

  case class Knight(row: Int, col: Int) {
    def moves: Set[Knight] = {
      Set(
        Knight(row + 1, col + 2),
        Knight(row + 1, col - 2),
        Knight(row - 1, col + 2),
        Knight(row - 1, col - 2),
        Knight(row + 2, col + 1),
        Knight(row + 2, col - 1),
        Knight(row - 2, col + 1),
        Knight(row - 2, col - 1)
      )
    }
  }

}
