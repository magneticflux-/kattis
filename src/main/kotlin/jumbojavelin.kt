fun main() {
    val numRods = readLine()!!.toInt()
    val rods = (0 until numRods).map { readLine()!!.toInt() }
    val totalLength = rods.sum() - (rods.size - 1)
    println(totalLength)
}
