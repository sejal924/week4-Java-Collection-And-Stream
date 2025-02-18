package junit.basic_junit.fileprocessor;

import junit_problems.basic_junit.fileprocessor.FileProcessor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";
    private FileProcessor fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writeToFile(TEST_FILE, content);
        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Sample Text");
        assertTrue(Files.exists(Paths.get(TEST_FILE)));
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
    }
}

