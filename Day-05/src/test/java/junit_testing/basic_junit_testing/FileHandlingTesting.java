package junit_testing.basic_junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import junit.basic_junit_test.testing_file_handling.FileHandling;
public class FileHandlingTesting {
    private static final String TEST_FILE = "src/test/java/Source";
    private FileHandling file;

    @BeforeEach
    void setUp() {
        file = new FileHandling();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE));
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        file.writeToFile(TEST_FILE, content);

        String readContent = file.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        file.writeToFile(TEST_FILE, "Hello!!");
        assertTrue(Files.exists(Path.of(TEST_FILE)));
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        Exception exception = assertThrows(IOException.class, () -> {
            file.readFromFile("Source.txt");
        });

        assertTrue(exception.getMessage().contains("nonexistent.txt"));
    }
}

