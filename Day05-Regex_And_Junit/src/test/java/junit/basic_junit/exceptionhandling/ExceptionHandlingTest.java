package junit.basic_junit.exceptionhandling;
import static org.junit.jupiter.api.Assertions.*;

import junit_problems.basic_junit.exceptionhandling.ExceptionHandling;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {

    private final ExceptionHandling calculator = new ExceptionHandling();

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
