package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    public void testAllMethods() {
        MathUtils math = new MathUtils();

        // Kiểm tra hàm add
        assertEquals(5, math.add(2, 3), "Hàm add chạy sai rồi!");

        // Kiểm tra hàm subtract (Đảm bảo JaCoCo quét qua dòng này)
        assertEquals(1, math.subtract(3, 2), "Hàm subtract chạy sai rồi!");

        // Kiểm tra hàm multiply (Đảm bảo JaCoCo quét qua dòng này)
        assertEquals(6, math.multiply(2, 3), "Hàm multiply chạy sai rồi!");
    }
}