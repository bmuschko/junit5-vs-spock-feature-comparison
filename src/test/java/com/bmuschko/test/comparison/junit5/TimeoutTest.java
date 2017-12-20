package com.bmuschko.test.comparison.junit5;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeoutTest {

    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Test
    void canAdd() {
        assertTimeout(ofSeconds(2), () -> {
            assertEquals(3, arithmeticOperation.add(1, 2));
        });
    }
}
