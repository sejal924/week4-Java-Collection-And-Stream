package junit.basic_junit.evennumber;

import junit_problems.basic_junit.evennumber.EvenNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenNumberTest {
    private final EvenNumber number = new EvenNumber();
    @Test
    void isEven(){
        assertEquals(true,number.isEven(4));
        assertEquals(false,number.isEven(9));
        assertEquals(true,number.isEven(2));
        assertEquals(false,number.isEven(7));
    }
}
