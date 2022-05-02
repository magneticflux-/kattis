val smile = """:\)|;\)|:-\)|;-\)""".toRegex()
fun main() {
    val indices = smile.findAll(readLine()!!).map { it.range.first }
    indices.forEach(::println)
}
