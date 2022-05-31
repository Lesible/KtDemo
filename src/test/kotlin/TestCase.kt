import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import java.awt.Color
import kotlin.test.assertEquals

class TestProduct {
    @Test
    fun `check all overloads`() {
        assertAll("Overloads called from kotlin", {
            println(addProduct("dog", 50.0, "little Dog"))
            println(addProduct("cat", 99.0))
            println(addProduct("rabbit"))
        })
    }

    @Test
    fun `shl and shr`() {
        assertAll("shift left from 1", {
            assertEquals(2, 1 shl 1)
            assertEquals(4, 1 shl 2)
            assertEquals(8, 1 shl 3)
            assertEquals(16, 1 shl 4)
            assertEquals(32, 1 shl 5)
            assertEquals(64, 1 shl 6)
            assertEquals(128, 1 shl 7)
            assertEquals(256, 1 shl 8)
        })
        assertAll("shift right from 255", {
            assertEquals(127, 255 shr 1)
            assertEquals(63, 255 shr 2)
            assertEquals(31, 255 shr 3)
            assertEquals(15, 255 shr 4)
            assertEquals(7, 255 shr 5)
            assertEquals(3, 255 shr 6)
            assertEquals(1, 255 shr 7)
            assertEquals(0, 255 shr 8)
        })

        val n1 = 5
        val n2 = -5
        println(n1.toString(2))
        println(n2.toString(2))
        println(n1 shr 1)
        println(n1 ushr 1)
        println(n2 shr 1)
        println(n2 ushr 1)
    }

    @Test
    fun `color to ints`() {
        val color = Color.MAGENTA
        val (a, r, g, b) = intsFromColor(color)
        assertAll("get rgb from color", {
            assertEquals(a, color.alpha)
            assertEquals(r, color.red)
            assertEquals(g, color.green)
            assertEquals(b, color.blue)
        })
        val rgb = (a and MASK shl 24) or (r and MASK shl 16) or
                (g and MASK shl 8) or (b and MASK)
        val intColor = Color(rgb, true)
        assertEquals(intColor, color)
    }

}
