package queue;

import org.example.queue.circular_buffer_simulation.CircularBufferSimulation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import queue.circular_buffer_simulation.CircularBufferSimulation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class CircularBufferSimulationTest {

    @Test
    void circularQueueTest(){
        CircularBufferSimulation queue=new CircularBufferSimulation(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);

        List<Integer> expected=Arrays.asList(4,2,3);
        assertEquals(queue.QueueAsList(),expected);

    }
}
