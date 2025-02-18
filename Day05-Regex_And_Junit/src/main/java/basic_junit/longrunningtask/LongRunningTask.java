package junit_problems.basic_junit.longrunningtask;

public class LongRunningTask {
    public String delaySecond() throws InterruptedException{
        Thread.sleep(3000);
        return "Task Completed";

    }
}
