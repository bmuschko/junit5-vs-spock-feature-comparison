package com.bmuschko.test.comparison.junit5;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.disabled;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.enabled;

public class ConditionalExecutionTest {

    private final static String SYS_PROP_KEY = "junit5.test.enabled";
    private final static String SYS_PROP_TRUE_VALUE = "true";
    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Test
    void testOnlyOnSystemPropertySet() {
        assumeTrue(SYS_PROP_TRUE_VALUE.equals(System.getProperty(SYS_PROP_KEY)));
        assertEquals(3, arithmeticOperation.add(1, 2));
    }

    @EnabledIfSystemProperty(named = SYS_PROP_KEY, matches = SYS_PROP_TRUE_VALUE)
    @Test
    void testOnlyOnSystemPropertySetByAnnotation() {
        assertEquals(3, arithmeticOperation.add(1, 2));
    }

    @ExtendWith(SystemPropertyConditionalExtension.class)
    @Test
    void testOnlyOnSystemPropertySetByExtension() {
        assertEquals(3, arithmeticOperation.add(1, 2));
    }

    private static class SystemPropertyConditionalExtension implements ExecutionCondition {

        @Override
        public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
            boolean enabled = SYS_PROP_TRUE_VALUE.equals(System.getProperty(SYS_PROP_KEY));

            if (enabled) {
                return enabled(String.format("System property '%s' evaluates to true", SYS_PROP_KEY));
            }

            return disabled(String.format("System property '%s' evaluates to false", SYS_PROP_KEY));
        }
    }
}
