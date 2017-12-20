package com.bmuschko.test.comparison.junit5;

import com.bmuschko.test.comparison.DefaultFileManager;
import com.bmuschko.test.comparison.FileManager;
import com.bmuschko.test.comparison.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockTest {

    private Path testFile;

    @BeforeEach
    void setup() throws IOException {
        testFile = Files.createTempFile("junit5", ".tmp");
    }

    @AfterEach
    void cleanup() {
        testFile.toFile().delete();
    }

    @Test
    void canMockFileReadOperation() throws IOException {
        String text = "hello";
        FileReader fileReader = mock(FileReader.class);
        when(fileReader.readContent(testFile)).thenReturn(text);
        FileManager fileManager = new DefaultFileManager(fileReader);
        Files.write(testFile, text.getBytes());
        assertEquals(text, fileManager.readContent(testFile));
    }
}
