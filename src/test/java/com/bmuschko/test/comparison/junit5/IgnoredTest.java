package com.bmuschko.test.comparison.junit5;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IgnoredTest {

    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Test
    @Disabled("for demonstration purposes")
    void canAdd() {
        assertEquals(3, arithmeticOperation.add(1, 2));
    }
}
