package assignments.executorframework.cachedthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {

    public static void main(String[] args) {
        System.out.println("Main Thread starts here...");

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0; i<6; i++)
        {
            executorService.execute(new CachedThreadPoolTask());
        }

        executorService.shutdown();

        System.out.println("Main Thread ends here....");
    }
}
