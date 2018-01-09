package com.bmuschko.test.comparison.junit5.conditional;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import static org.junit.jupiter.api.extension.ConditionEvaluationResult.disabled;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.enabled;

public class SystemPropertyConditionalExtension implements ExecutionCondition {

    private final static String SYS_PROP_KEY = "junit5.test.enabled";
    private final static String SYS_PROP_TRUE_VALUE = "true";

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        boolean enabled = SYS_PROP_TRUE_VALUE.equals(System.getProperty(SYS_PROP_KEY));

        if (enabled) {
            return enabled(String.format("System property '%s' evaluates to true", SYS_PROP_KEY));
        }

        return disabled(String.format("System property '%s' evaluates to false", SYS_PROP_KEY));
    }
}
