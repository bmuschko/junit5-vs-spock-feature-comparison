package com.bmuschko.test.comparison.spock

import com.bmuschko.test.comparison.DefaultFileManager
import com.bmuschko.test.comparison.FileReader
import spock.lang.Specification
import spock.lang.Subject

import java.nio.file.Files

class MockTest extends Specification {

    def fileReader = Mock(FileReader)
    @Subject def fileManager = new DefaultFileManager(fileReader)
    def testFile

    void setup() {
        testFile = Files.createTempFile("junit5", ".tmp")
    }

    void cleanup() {
        testFile.toFile().delete()
    }

    def "can mock file read operation"() {
        given:
        def text = "hello"
        Files.write(testFile, text.getBytes())

        when:
        def content = fileManager.readContent(testFile)

        then:
        1 * fileReader.readContent(testFile) >> text
        content == text
    }
}
