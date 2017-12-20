package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.DefaultFileReader
import spock.lang.Specification
import spock.lang.Subject

import java.nio.file.Files

class FixtureSetupCleanup extends Specification {

    @Subject def fileReader = new DefaultFileReader()
    def testFile

    def setup() {
        testFile = Files.createTempFile("junit5", ".tmp")
    }

    def cleanup() {
        testFile.toFile().delete()
    }

    def "can read file"() {
        given:
        def text = "hello"
        testFile << text

        when:
        def content = fileReader.readContent(testFile)

        then:
        content == text
    }
}