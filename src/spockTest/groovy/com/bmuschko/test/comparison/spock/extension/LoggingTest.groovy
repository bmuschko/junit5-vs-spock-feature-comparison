package com.bmuschko.test.comparison.spock.extension

import com.bmuschko.test.comparison.ArithmeticOperation
import spock.lang.Specification
import spock.lang.Subject

@BeforeAfterLogging
class LoggingTest extends Specification {

    @Subject def arithmeticOperation = new ArithmeticOperation()

    def canAdd() {
        expect:
        arithmeticOperation.add(1, 2) == 3
    }
}
