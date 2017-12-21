package com.bmuschko.test.comparison;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DefaultFileReader implements FileReader {

    @Override
    public String readContent(Path path) throws IOException {
        if (Files.notExists(path)) {
            throw new IOException("File does not exist");
        }

        return new String(Files.readAllBytes(path));
    }
}
