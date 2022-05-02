val vowels = setOf('a', 'e', 'i', 'o', 'u')
fun main() {
    val count = readLine()!!.toLowerCase().count { it in vowels }
    println(count)
}
