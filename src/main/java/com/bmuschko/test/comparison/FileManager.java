package com.bmuschko.test.comparison;

import java.io.IOException;
import java.nio.file.Path;

public interface FileManager {

    String readContent(Path path) throws IOException;
}
