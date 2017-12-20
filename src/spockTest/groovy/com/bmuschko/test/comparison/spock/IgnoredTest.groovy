package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.ArithmeticOperation
import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Subject

class IgnoredTest extends Specification {

    @Subject def arithmeticOperation = new ArithmeticOperation()

    @Ignore("for demonstration purposes")
    def canAdd() {
        expect:
        arithmeticOperation.add(1, 2) == 3
    }
}
