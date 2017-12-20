package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.ArithmeticOperation
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Timeout

class TimeoutTest extends Specification {

    @Subject def arithmeticOperation = new ArithmeticOperation()

    @Timeout(2)
    def canAdd() {
        expect:
        arithmeticOperation.add(1, 2) == 3
    }
}
