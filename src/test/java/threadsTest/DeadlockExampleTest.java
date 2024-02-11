package threadsTest;

import org.junit.Test;
import threads.DeadlockExample;

public class DeadlockExampleTest {
    @Test(timeout = 2000)
    public void testDeadlock() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DeadlockExample.main(new String[0]);
            }
        });

        thread1.start();
        thread1.join();
    }
}

