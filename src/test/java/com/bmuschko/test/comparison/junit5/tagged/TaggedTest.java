package com.bmuschko.test.comparison.junit5.tagged;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaggedTest {

    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Tag("slow")
    @Test
    void runsSlowly() {
        assertEquals(3, arithmeticOperation.add(1, 2));
    }

    @Tag("fast")
    @Test
    void runsFast() {
        assertEquals(1, arithmeticOperation.substract(2, 1));
    }
}
