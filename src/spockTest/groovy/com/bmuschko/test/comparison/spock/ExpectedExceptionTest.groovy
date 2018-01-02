package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.DefaultFileReader
import spock.lang.FailsWith
import spock.lang.Specification
import spock.lang.Subject

import java.nio.file.Paths

class ExpectedExceptionTest extends Specification {

    @Subject def fileReader = new DefaultFileReader()

    @FailsWith(IOException)
    def "throws exception if file contents cannot be read"() {
        expect:
        fileReader.readContent(Paths.get('hello.text'))
    }

    def "throws exception if file contents cannot be read and assert exception message"() {
        when:
        fileReader.readContent(Paths.get('hello.text'))

        then:
        def t = thrown(IOException)
        t.message == 'File does not exist'
    }
}
