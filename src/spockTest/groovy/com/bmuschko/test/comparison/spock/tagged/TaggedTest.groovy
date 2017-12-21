package com.bmuschko.test.comparison.spock.tagged

import com.bmuschko.test.comparison.ArithmeticOperation
import spock.lang.Specification
import spock.lang.Subject

class TaggedTest extends Specification {

    @Subject def arithmeticOperation = new ArithmeticOperation()

    @Slow
    def "runs slowly"() {
        expect:
        arithmeticOperation.add(1, 2) == 3
    }

    @Fast
    def "runs fast"() {
        expect:
        arithmeticOperation.substract(2, 1) == 1
    }
}
