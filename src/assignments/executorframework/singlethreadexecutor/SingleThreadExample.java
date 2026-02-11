package assignments.executorframework.singlethreadexecutor;

import assignments.executorframework.cachedthreadpool.CachedThreadPoolTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExample {

    public static void main(String[] args) {
        System.out.println("Main Thread starts here...");

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for(int i=0; i<3; i++)
        {
            executorService.execute(new SingleThreadPoolTask());
        }

        executorService.shutdown();

        System.out.println("Main Thread ends here....");
    }
}
