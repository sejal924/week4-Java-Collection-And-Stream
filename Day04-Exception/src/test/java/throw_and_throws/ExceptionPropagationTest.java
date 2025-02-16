package throw_and_throws;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionPropagationTest {
    @Test
    void successfulSI(){
        double si=ExceptionPropagation.calculateInterest(1000,10,1);
        assertEquals(100,si);
    }
    @Test
    void negativePrinciple(){
        Exception
                exception=assertThrows(IllegalArgumentException.class,()->ExceptionPropagation.calculateInterest(-1000,10,1));
        assertEquals("Invalid input: Amount and rate must be positive",exception.getMessage());
    }
    @Test
    void negativeRate(){
        Exception
                exception=assertThrows(IllegalArgumentException.class,()->ExceptionPropagation.calculateInterest(1000,-10,1));
        assertEquals("Invalid input: Amount and rate must be positive",exception.getMessage());
    }
}
