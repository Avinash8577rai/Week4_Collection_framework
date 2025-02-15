package Day5.JUnit.basic.PerformanceTestingUsingTimeout;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskManagerTest {

    private final TaskManager taskManager = new TaskManager();

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    void testLongRunning(){
        taskManager.logRunningTask();
    }
}
