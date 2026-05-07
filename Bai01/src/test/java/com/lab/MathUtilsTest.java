package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils utils = new MathUtils();
        assertEquals(10, utils.add(3, 7));
    }
}
