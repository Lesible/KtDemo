import java.awt.Color

const val MASK = 0xff

fun intsFromColor(color: Color): List<Int> {
    val rgb = color.rgb
    val alpha = rgb shr 24 and MASK
    val red = rgb shr 16 and MASK
    val green = rgb shr 8 and MASK
    val blue = rgb and MASK
    return listOf(alpha, red, green, blue)
}
