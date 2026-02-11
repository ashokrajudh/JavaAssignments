package assignments.executorframework.fixedThreadPool;

import assignments.executorframework.fixedThreadPool.LoopTaskA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {


    public static void main(String[] args) {
        System.out.println("Main Thread starts here...");

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0; i<3; i++)
        {
            executorService.execute(new LoopTaskA());
        }

        executorService.shutdown();

        System.out.println("Main Thread ends here....");
    }

}
