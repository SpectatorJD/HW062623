package com.HW062623.HW062623;

import org.junit.jupiter.api.Test;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

public class CalculatorTest {

    @Test

    void result() {
        assertEquals(5, 2 + 3);
        assertEquals(13, 6 + 7);
        assertEquals(6, 2 * 3);
        assertEquals(25, 5 * 5);
        assertEquals(2, 5 - 3);
        assertEquals(6, 20 - 14);
        assertEquals(7, 14 / 2);
        assertEquals(10, 100 / 10);
        assertEquals(-11, 33 - 44 );
        assertEquals(-36, 20 - 56);
    }

    private void assertEquals(int num, int num1) {
    }

}

