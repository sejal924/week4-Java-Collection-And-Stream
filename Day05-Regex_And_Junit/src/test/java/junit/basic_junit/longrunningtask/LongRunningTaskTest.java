package junit.basic_junit.longrunningtask;

import junit_problems.basic_junit.longrunningtask.LongRunningTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongRunningTaskTest {
    private final  LongRunningTask longrunning = new LongRunningTask();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fails if execution exceeds 2 seconds
    void testLongRunningTask() throws InterruptedException {
        assertEquals("Task Completed", longrunning.delaySecond());

    }
}
