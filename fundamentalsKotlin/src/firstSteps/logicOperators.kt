package firstSteps

fun main() {
    val a: Boolean = true
    val b: Boolean = false

    println("Matrix:")
    println("OPR | Value A | Value B | Result")

    // operator AND (&&)
    val and: Boolean = a && b           // false
    println("AND | $a | $b | $and")     // true when all values are true

    // operator OR (||)
    val or: Boolean = a || b        // true
    println("OR | $a | $b | $or")   // true when one value is true

    // operator NOT (!)
    val not: Boolean = !a               // false
    println("NOT | $a | NULL | $not")   // invert the value

    // Operator equal (==)
    val equal: Boolean = a == b         // false
    println("EQUAL | $a | $b | $equal") // true when A is equal to B

    // operator different from (!=)
    val differentFrom: Boolean = a != b             // true
    println("DIFFERENT | $a | $b | $differentFrom") // true when A is different from B

    // operator is the type (is)
    val text: Any = "3"                                                 // is String
    val num: Any = 7                                                    // is not String
    println("IS TYPE | ${text is String} | ${num is String} | NULL")    // verify type from variable

    // operator is not the type (in)
    println("IS NOT TYPE | ${text !is String} | ${num !is String} | NULL")    // verify type from variable

    // operator belongs (in)
    val range: IntRange = 1..10                    // 1 to 10
    println("BELONGS | ${num in range} | NULL | NULL")  // true when value belongs the range

    // operator dont belongs (in)
    println("DONT BELONGS | ${num !in range} | NULL | NULL")  // false

}