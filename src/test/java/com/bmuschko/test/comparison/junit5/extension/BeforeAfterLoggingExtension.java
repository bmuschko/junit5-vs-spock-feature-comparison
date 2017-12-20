package com.bmuschko.test.comparison.junit5.extension;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;

public class BeforeAfterLoggingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    @Override
    public void beforeTestExecution(ExtensionContext context) {
        Method testMethod = context.getRequiredTestMethod();
        System.out.println(String.format("Starting test method %s.%s", testMethod.getDeclaringClass(), testMethod.getName()));
    }

    @Override
    public void afterTestExecution(ExtensionContext context) {
        Method testMethod = context.getRequiredTestMethod();
        System.out.println(String.format("Finishing test method %s.%s", testMethod.getDeclaringClass(), testMethod.getName()));
    }
}
