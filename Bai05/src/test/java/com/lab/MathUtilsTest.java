package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    void testSubtract() {
        assertEquals(1, new MathUtils().subtract(3, 2));
    }
    @Test
    void testMultiply() {
        assertEquals(6, new MathUtils().multiply(2, 3));
    }
}