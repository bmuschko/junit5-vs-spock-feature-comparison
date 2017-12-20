package com.bmuschko.test.comparison;

import java.io.IOException;
import java.nio.file.Path;

public class DefaultFileManager implements FileManager {

    private final FileReader fileReader;

    public DefaultFileManager(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    @Override
    public String readContent(Path path) throws IOException {
        return fileReader.readContent(path);
    }
}
