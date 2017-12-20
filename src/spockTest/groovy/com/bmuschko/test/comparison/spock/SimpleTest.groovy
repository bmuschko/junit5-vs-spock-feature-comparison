package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.ArithmeticOperation
import spock.lang.Specification
import spock.lang.Subject

class SimpleTest extends Specification {

    @Subject def arithmeticOperation = new ArithmeticOperation()

    def canAdd() {
        expect:
        arithmeticOperation.add(1, 2) == 3
    }

    def canSubstract() {
        expect:
        arithmeticOperation.substract(2, 1) == 1
    }

    def canMultiply() {
        expect:
        arithmeticOperation.multiply(2, 3) == 6
    }

    def canDivide() {
        expect:
        arithmeticOperation.divide(6, 2) == 3
    }
}
