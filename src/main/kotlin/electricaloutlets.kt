fun main() {
    val cases = readLine()!!.toInt()

    for (case in 0 until cases) {
        val strips = readLine()!!.split(" ").drop(1).map(String::toInt)
        val totalOutlets = 1 + strips.sum()
        val availableOutlets = totalOutlets - strips.size
        println(availableOutlets)
    }
}
