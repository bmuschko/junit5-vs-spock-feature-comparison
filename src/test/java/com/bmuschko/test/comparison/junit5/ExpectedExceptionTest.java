package com.bmuschko.test.comparison.junit5;

import com.bmuschko.test.comparison.DefaultFileReader;
import com.bmuschko.test.comparison.FileReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExpectedExceptionTest {

    private final FileReader fileReader = new DefaultFileReader();

    @Test
    void cannotReadNonExistentFile() {
        assertThrows(IOException.class, () -> {
            fileReader.readContent(Paths.get("hello.text"));
        });
    }
}
