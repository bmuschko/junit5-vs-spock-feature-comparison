package com.bmuschko.test.comparison.junit5;

import com.bmuschko.test.comparison.ArithmeticOperation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataDrivenTest {

    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4, 5 })
    void canAdd(int b) {
        assertTrue(arithmeticOperation.add(1, b) >= 2);
    }

    @ParameterizedTest(name = "can add {0} to {1} and receive {2}")
    @MethodSource("additionProvider")
    void canAddAndAssertExactResult(int a, int b, int result) {
        assertEquals(result, arithmeticOperation.add(a, b));
    }

    static Stream<Arguments> additionProvider() {
        return Stream.of(
            Arguments.of(1, 3, 4),
            Arguments.of(3, 4, 7),
            Arguments.of(10, 20, 30)
        );
    }
}
