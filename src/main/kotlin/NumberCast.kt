import kotlin.math.pow

val intVar = 1U
val longVar = intVar.toULong()
const val num = 42

fun main() {
    println(longVar)
    println("Radix  Value")
    (Character.MIN_RADIX..Character.MAX_RADIX).forEach {
        println("$it:   ${num.toString(it)}")
    }
}
