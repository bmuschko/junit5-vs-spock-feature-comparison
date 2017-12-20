package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.ArithmeticOperation
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

class DataDrivenTest extends Specification {

    @Subject def arithmeticOperation = new ArithmeticOperation()

    def "can add"() {
        expect:
        arithmeticOperation.add(1, b) >= 2

        where:
        b << [1, 2, 3, 4, 5]
    }

    @Unroll
    def "can add #a to #b and receive #result"() {
        expect:
        arithmeticOperation.add(a, b) == result

        where:
        a  | b  | result
        1  | 3  | 4
        3  | 4  | 7
        10 | 20 | 30
    }
}
