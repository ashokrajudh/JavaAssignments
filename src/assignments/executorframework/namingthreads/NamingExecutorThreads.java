package assignments.executorframework.namingthreads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NamingExecutorThreads {

    public static void main(String[] args) {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("[" + currentThreadName + "]Main Thread starts here...");

        ExecutorService executorService = Executors.newCachedThreadPool(new NamesThreadFactory());

        for(int i=0; i < 3; i++)
        {
            executorService.execute(new NamingExecutorThreadTask());
        }

        executorService.shutdown();

        System.out.println("[" + currentThreadName + "]Main Thread ends here...");
    }
}
