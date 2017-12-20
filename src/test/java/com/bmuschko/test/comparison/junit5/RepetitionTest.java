package com.bmuschko.test.comparison.junit5;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepetitionTest {

    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @RepeatedTest(10)
    void canAdd() {
        assertEquals(3, arithmeticOperation.add(1, 2));
    }

    @RepeatedTest(value = 5, name = "Iteration {currentRepetition} of {totalRepetitions}")
    void canSubstract() {
        assertEquals(1, arithmeticOperation.substract(2, 1));
    }
}
