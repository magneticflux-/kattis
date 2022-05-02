fun main() {
    val count = readLine()!!.toInt()
    (0 until count).map { readLine()!! }.filterIndexed { index, _ -> index % 2 == 0 }.forEach(::println)
}
