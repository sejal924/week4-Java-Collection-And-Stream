package queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.queue.reverse_a_queue.ReverseQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ReverseQueueTest {

    @Test
    void reversingQueueTest(){
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        ReverseQueue.reversingQueue(queue);
        Queue<Integer> expected=new ArrayDeque<>(Arrays.asList(40,30,20,10));
        assertArrayEquals(expected.toArray(),queue.toArray());
    }
}
