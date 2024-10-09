fun sum01(a: Int, b: Int): Int {
    return a + b
} // basic

fun sum02(a: Int, b: Int) = a + b // single-expression

fun printSum01(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
} // return Unit

fun printSum02(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
} // omit Unit