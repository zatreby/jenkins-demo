package com.example.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testDivideNormal() {
        assertEquals(5.0, MathUtils.divide(10, 2), 1e-9);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(1, 0));
    }

    @Test
    void testPercentageNormal() {
        assertEquals(40.0, MathUtils.percentage(2, 5), 1e-9);
    }
}
