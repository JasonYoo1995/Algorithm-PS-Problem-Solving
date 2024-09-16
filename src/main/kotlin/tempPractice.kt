fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val list = (a * b * c).toString().map { it.toString().toInt() }

    for (i in 0..9) {
        println(list.count { it == i })
    }
}
