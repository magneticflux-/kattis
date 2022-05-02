fun main() {
    val (G, T, _) = readLine()!!.split(" ").map(String::toInt)
    val items = readLine()!!.split(" ").map(String::toInt)

    val towingCapacity = G - T
    val limit = 9 * towingCapacity / 10
    val itemWeight = items.sum()
    val remainingLimit = limit - itemWeight
    println(remainingLimit)
}
