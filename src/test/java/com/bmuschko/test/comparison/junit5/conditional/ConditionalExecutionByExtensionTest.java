package com.bmuschko.test.comparison.junit5.conditional;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SystemPropertyConditionalExtension.class)
public class ConditionalExecutionByExtensionTest {

    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Test
    void testOnlyOnSystemSystemPropertySet() {
        assertEquals(3, arithmeticOperation.add(1, 2));
    }
}
