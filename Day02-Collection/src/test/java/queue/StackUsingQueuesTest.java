package queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.queue.stack_using_queues.StackUsingQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class StackUsingQueuesTest {

    @Test
    void stackQueueTest(){
        StackUsingQueues queue=new StackUsingQueues();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        Queue<Integer> expected=new ArrayDeque<>(Arrays.asList(1,2,3));
        assertArrayEquals(queue.toQueue().toArray(),expected.toArray());
    }
}
