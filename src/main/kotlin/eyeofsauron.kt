fun main() {
    val s = readLine()!!
    val beforeEye = s.indexOf('(')
    val afterEye = s.length - (beforeEye + 1) - 1

    if (beforeEye == afterEye) {
        println("correct")
    } else
        println("fix")
}
