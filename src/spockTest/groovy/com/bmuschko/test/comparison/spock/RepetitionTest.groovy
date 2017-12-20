package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.ArithmeticOperation
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

class RepetitionTest extends Specification {

    @Subject def arithmeticOperation = new ArithmeticOperation()

    @Unroll
    def "can add"() {
        expect:
        arithmeticOperation.add(1, 2) == 3

        where:
        i << (1..10)
    }

    @Unroll
    def "Iteration #i of 5"() {
        expect:
        arithmeticOperation.substract(2, 1) == 1

        where:
        i << (1..5)
    }
}
