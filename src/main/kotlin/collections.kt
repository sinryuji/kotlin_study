fun collections() {
    val items = listOf("banana", "avocado", "apple", "kiwifruit")

    for (item in items) {
        println(item)
    }

    println()

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    println()

    items.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}