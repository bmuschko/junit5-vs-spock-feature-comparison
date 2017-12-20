package com.bmuschko.test.comparison.junit5.extension;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BeforeAfterLoggingExtension.class)
public class LoggingTest {

    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Test
    void canAdd() {
        assertEquals(3, arithmeticOperation.add(1, 2));
    }
}
