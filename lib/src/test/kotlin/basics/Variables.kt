package basics

import kotlin.test.Test
import kotlin.test.assertEquals

class VariablesTest {
    @Test
    fun vals() {
        val a = 200
        var b = a
        assertEquals(b, 100)
    }
}
