fun main() {
    val cases = readLine()!!.toInt()
    val sum = (0 until cases)
        .map {
            val (quality, years) = readLine()!!.split(" ").map(String::toDouble)
            quality * years
        }
        .sum()
    print(sum)
}
