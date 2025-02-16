package try_with_resources;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class TryWithResourcesTest {
    @Test
    void testReadingFile() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String testFilePath = "src/main/java/try_with_resources/info.txt";
        TryWithResources.readingFile(testFilePath);
        String output = outputStream.toString().trim();
        assertFalse(output.isEmpty(), "Output should not be empty");
    }
}

