package finally_block_execution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class FinallyBlockExecutionTest {
    @Test
    void successFullDivisionTest(){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        FinallyBlockExecution.divisionOperation(10,2);
        String expectedOutput = "Answer(10/2) : 5" + System.lineSeparator() +
                "Operation Completed." + System.lineSeparator();
        assertEquals(expectedOutput,output.toString());
    }
    @Test
    void dividebyZeroTest(){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        FinallyBlockExecution.divisionOperation(10,0);
        String expectedOutput = "Invalid Operation: Divide by Zero." +
                System.lineSeparator() + "Operation Completed." + System.lineSeparator();
        assertEquals(expectedOutput,output.toString());
    }
}
