package firstSteps

fun dataTypes () {
    // numbers
    val byte: Byte = -128
    val short: Short = 32_767
    val int: Int = 1_000_000
    val long: Long = 2_000_000_000L

    val float: Float = 3f
    val double: Double = 3.0

    // text
    val char: Char = 'c'
    val string: String = "Hello World"

    val text: String = """
        Hello World
    """.trimIndent()

    val boolean: Boolean = true // false

    print(Math.sqrt(16.0))
}