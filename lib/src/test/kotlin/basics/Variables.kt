package basics

import kotlin.test.Test
import kotlin.test.assertEquals

class VariablesTest {

    @Test
    fun variables() {


    }
}

// https://hyperskill.org/learn/step/17408
class ValVariablesTest {
    @Test
    fun variables_1() {

        val a = 200
        var b = a
        assertEquals(b, 200)
    }

    @Test
    fun variables_2() {
        var x = 10
        val y = x
        assertEquals(y,10)

        x= 20
        assertEquals(y,10)
        assertEquals(x,20)
    }

    @Test
    fun mutability_2() {

        // It is important to note that val is not a synonym of immutable.

        // In the following example, we will use a MutableList, which is an ordered set of elements of the same type.

        val list = mutableListOf(1, 2, 3, 4, 5)
        assertEquals(5, list.size)
        list.add(10)
        assertEquals(6, list.size)
        assertEquals(10, list[5])

        // It is always possible to change the internal state of a val variable: while it is prohibited to reassign
        // the variable, its content can be modified in some other ways.

        //list = mutableListOf(11,12) // Val cannot be reassigned
    }
}
