fun main() {
    val problems = readLine()!!.split(";").flatMapTo(hashSetOf()) {
        if ("-" in it) {
            val (a, b) = it.split("-").map(String::toInt)
            a..b
        } else {
            listOf(it.toInt())
        }
    }
    println(problems.size)
}
