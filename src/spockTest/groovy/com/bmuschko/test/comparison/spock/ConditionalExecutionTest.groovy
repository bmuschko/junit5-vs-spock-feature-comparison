package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.ArithmeticOperation
import spock.lang.Requires
import spock.lang.Specification
import spock.lang.Subject

class ConditionalExecutionTest extends Specification {

    private final static String SYS_PROP_KEY = "spock.test.enabled"
    private final static String SYS_PROP_TRUE_VALUE = "true"
    @Subject def arithmeticOperation = new ArithmeticOperation()

    @Requires({ SYS_PROP_TRUE_VALUE == sys[SYS_PROP_KEY] })
    def "can add"() {
        expect:
        arithmeticOperation.add(1, 2) == 3
    }
}
