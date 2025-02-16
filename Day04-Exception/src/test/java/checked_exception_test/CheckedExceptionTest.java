package checked_exception_test;

import static org.junit.jupiter.api.Assertions.*;

import checked_exception.CheckedException;
import org.junit.jupiter.api.Test;
public class CheckedExceptionTest {
    @Test
    void readingFileTest(){
        String filePath="src/main/java/checked_exception/Data.txt";
        assertDoesNotThrow(()-> CheckedException.main(new String[]{filePath.toString()}));
    }
}