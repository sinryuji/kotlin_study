fun variables() {
    val a: Int = 5 // java final
    // a += 1 << impossible

    var b: Int = 5 // variable availability
    b += 1 // possible

    var c = 5 // `Int` type is inferred

    var d: Int // Declares the variable d without initialization
    d = 3 // // Initializes the variable c after declaration

    val PI = 3.14
    var x = 0

    fun incrementX() {
        x += 1
    }
}