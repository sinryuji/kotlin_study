fun sum01(a: Int, b: Int): Int {
    return a + b
}

fun sum02(a: Int, b: Int) = a + b

fun printSum01(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum02(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    val a: Int = 3
    val b: Int = 5

    println(sum01(a, b))
    println(sum02(a, b))
    printSum01(a, b)
    printSum02(a, b)
}