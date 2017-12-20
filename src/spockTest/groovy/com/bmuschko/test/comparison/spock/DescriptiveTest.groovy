package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.ArithmeticOperation
import spock.lang.Specification
import spock.lang.Subject

class DescriptiveTest extends Specification {

    @Subject def arithmeticOperation = new ArithmeticOperation()

    def "can add two numbers"() {
        expect:
        arithmeticOperation.add(1, 2) == 3
    }

    def "can substract a number from another one"() {
        expect:
        arithmeticOperation.substract(2, 1) == 1
    }

    def "can multiple two numbers"() {
        expect:
        arithmeticOperation.multiply(2, 3) == 6
    }

    def "can divide two numbers"() {
        expect:
        arithmeticOperation.divide(6, 2) == 3
    }
}
