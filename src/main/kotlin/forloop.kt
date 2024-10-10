fun forloop(): Unit {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items){
        println(item)
    }
}

fun forloopIndex(): Unit {
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }
}