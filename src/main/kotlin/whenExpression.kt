fun describe(obj: Any): String =
    when (obj) {
        1           -> "One"
        "Hello"     -> "Greeting"
        is Long     -> "Long"
        !is String  -> "Not a string"
        else        -> "Unknown"
    }

fun systemInfo01(): String {
    val numberOfCores = Runtime.getRuntime().availableProcessors()
    return when (numberOfCores) {
        1 -> "1 core, packing this one to the museum"
        in 2..16 -> "You hav $numberOfCores cores"
        else -> "$numberOfCores cores!, I want your machine"
    }
}

fun systemInfo02(): String {
    return when (val numberOfCores = Runtime.getRuntime().availableProcessors()) {
        1 -> "1 core, packing this one to the museum"
        in 2..16 -> "You hav $numberOfCores cores"
        else -> "$numberOfCores cores!, I want your machine"
    }
}