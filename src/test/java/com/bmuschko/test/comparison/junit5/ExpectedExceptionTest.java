package com.bmuschko.test.comparison.junit5;

import com.bmuschko.test.comparison.DefaultFileReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExpectedExceptionTest {

    private final DefaultFileReader fileReader = new DefaultFileReader();

    @Test
    void cannotReadNonExistentFile() {
        assertThrows(IOException.class, () -> {
            fileReader.readContent(Paths.get("hello.text"));
        });
    }
}
