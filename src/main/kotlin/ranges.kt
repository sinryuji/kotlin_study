fun ranges01(): Unit {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}

fun ranges02(): Unit {
    val list = listOf("a", "b", "c")

    println("list.lastIndex: ${list.lastIndex}")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    println("list.size: ${list.size}")
    println("list.indices: ${list.indices}")
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}

fun ranges03(): Unit {
    for (x in 1..5) {
        println(x)
    }
}

fun ranges04(): Unit {
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}