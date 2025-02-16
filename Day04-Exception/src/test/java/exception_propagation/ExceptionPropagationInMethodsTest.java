package exception_propagation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class ExceptionPropagationInMethodsTest {
    @Test
    void propagationTest(){
        Exception
                exception=assertThrows(ArithmeticException.class,()->ExceptionPropagationInMethods.
                method2(10,0));
        assertEquals("/ by zero",exception.getMessage());
    }
    @Test
    void propagationSuccessfulTest(){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        ExceptionPropagationInMethods.method2(10,2);
        assertEquals("Division:5",output.toString().trim());
    }
}