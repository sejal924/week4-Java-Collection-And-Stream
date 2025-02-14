package queue;

import org.junit.jupiter.api.Test;
import org.example.queue.generate_binary_numbers.GenerateBinaryNumbers;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class GenerateBinaryNumbersTest {

    @Test
    void generateBinaryNumberFromQueueTest(){
        int n=5;
        Queue<String> queue= GenerateBinaryNumbers.generateBinaryNumberFromQueue(n);
        Queue<String> expected=new ArrayDeque<>();
        expected.add("1");
        expected.add("10");
        expected.add("11");
        expected.add("100");
        expected.add("101");

        assertArrayEquals(queue.toArray(),expected.toArray());
    }
}
