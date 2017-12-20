package com.bmuschko.test.comparison.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Test
    void canAdd() {
        assertEquals(3, arithmeticOperation.add(1, 2));
    }

    @Test
    void canSubstract() {
        assertEquals(1, arithmeticOperation.substract(2, 1));
    }

    @Test
    void canMultiply() {
        assertEquals(6, arithmeticOperation.multiply(2, 3));
    }

    @Test
    void canDivide() {
        assertEquals(3, arithmeticOperation.divide(6, 2));
    }
}
