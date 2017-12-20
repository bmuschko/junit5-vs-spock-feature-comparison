package com.bmuschko.test.comparison.junit5;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ConditionalExecutionTest {

    private final static String SYS_PROP_KEY = "junit5.test.enabled";
    private final static String SYS_PROP_TRUE_VALUE = "true";
    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Test
    void testOnlyOnSystemSystemPropertySet() {
        assumeTrue(SYS_PROP_TRUE_VALUE.equals(System.getProperty(SYS_PROP_KEY)));
        assertEquals(3, arithmeticOperation.add(1, 2));
    }
}
