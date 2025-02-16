package custom_exception_test;

import custom_exception.CustomException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class CustomExceptionTest {
    @Test
    void testValidateAge_AgeAbove18() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CustomException.validateAge(20);
        assertTrue(outContent.toString().trim().contains("Access granted"));
    }
    @Test
    void testValidateAge_AgeBelow18() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CustomException.validateAge(15);
        assertTrue(outContent.toString().trim().contains("Age must be 18 or above"));
    }
}