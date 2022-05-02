fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    if (a > b)
        println(1)
    else
        println(0)
}
