package com.bmuschko.test.comparison.junit5;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescriptiveTest {

    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Test
    @DisplayName("can add two numbers")
    void canAdd() {
        assertEquals(3, arithmeticOperation.add(1, 2));
    }

    @Test
    @DisplayName("can substract a number from another one")
    void canSubstract() {
        assertEquals(1, arithmeticOperation.substract(2, 1));
    }

    @Test
    @DisplayName("can multiple two numbers")
    void canMultiply() {
        assertEquals(6, arithmeticOperation.multiply(2, 3));
    }

    @Test
    @DisplayName("can divide two numbers")
    void canDivide() {
        assertEquals(3, arithmeticOperation.divide(6, 2));
    }
}
