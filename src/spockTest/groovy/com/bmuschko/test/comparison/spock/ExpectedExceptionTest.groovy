package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.DefaultFileReader
import spock.lang.FailsWith
import spock.lang.Specification
import spock.lang.Subject

import java.nio.file.Paths

class ExpectedExceptionTest extends Specification {

    @Subject def fileReader = new DefaultFileReader()

    @FailsWith(IOException)
    def "cannot read non-existent file"() {
        expect:
        fileReader.readContent(Paths.get('hello.text'))
    }
}
