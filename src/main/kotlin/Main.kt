class Person(
    val first: String,
    val middle: String?,
    val last: String,
)

val jkRowling = Person("Joanne", null, "Rowling")
val northWest = Person("North", null, "West")

fun test() {
    if (northWest.middle != null) {
        val middleLength = northWest.middle.length
    }
    var p = Person("test", null, "test")
    if (p.middle != null) {
        val middleLength = p.middle?.length ?: 0
    }
}
