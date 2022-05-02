import Result.*

fun main() {
    val cases = readLine()!!.toInt()

    for (case in 0 until cases) {
        val (rows, cols, n) = readLine()!!.split(" ").map(String::toInt)

        // Populate the grid
        var grid = (0 until rows).map { readLine()!!.toCharArray() }.toTypedArray()

        // Do the steps
        for (step in 0 until n) {
            val newGrid = grid.map { it.copyOf() }.toTypedArray()

            // Main cells
            for (row in 0 until rows - 1) {
                for (col in 0 until cols - 1) {
                    val first = grid[row][col]

                    var second = grid[row + 1][col]
                    when (first battle second) {
                        Win -> newGrid[row + 1][col] = first
                        Loss -> newGrid[row][col] = second
                        Draw -> {}
                    }

                    second = grid[row][col + 1]
                    when (first battle second) {
                        Win -> newGrid[row][col + 1] = first
                        Loss -> newGrid[row][col] = second
                        Draw -> {}
                    }
                }
            }
            // Last column
            for (row in 0 until rows - 1) {
                val col = cols - 1

                val first = grid[row][col]

                val second = grid[row + 1][col]
                when (first battle second) {
                    Win -> newGrid[row + 1][col] = first
                    Loss -> newGrid[row][col] = second
                    Draw -> {}
                }
            }
            // Last row
            for (col in 0 until cols - 1) {
                val row = rows - 1

                val first = grid[row][col]

                val second = grid[row][col + 1]
                when (first battle second) {
                    Win -> newGrid[row][col + 1] = first
                    Loss -> newGrid[row][col] = second
                    Draw -> {}
                }
            }

            grid = newGrid
        }

        // Print the grid
        for (row in 0 until rows) {
            for (col in 0 until cols) {
                print(grid[row][col])
            }
            println()
        }
        println()
    }
}

infix fun Char.battle(other: Char): Result {
    return if (this == 'R') {
        when (other) {
            'S' -> Win
            'P' -> Loss
            else -> Draw
        }
    } else if (this == 'S') {
        when (other) {
            'P' -> Win
            'R' -> Loss
            else -> Draw
        }
    } else {
        when (other) {
            'R' -> Win
            'S' -> Loss
            else -> Draw
        }
    }
}

enum class Result {
    Win,
    Loss,
    Draw
}
