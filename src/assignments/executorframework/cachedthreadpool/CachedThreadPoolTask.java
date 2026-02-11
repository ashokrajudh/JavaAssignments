package assignments.executorframework.cachedthreadpool;

import java.util.concurrent.TimeUnit;

public class CachedThreadPoolTask implements Runnable{

    private static int count = 0;
    private int id;


    @Override
    public void run() {
        System.out.println("#### <Task-" + id + "> STARTING ####");

        for (int i = 10; i > 0; i--) {
            System.out.println("< " + id + "> WITH ITERATION VALUE- " + i);

            try {

                TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

        System.out.println("*****<TASK-" + id + "> COMPLETED ******");
    }

    public CachedThreadPoolTask()
    {
        this.id = ++count;
    }
}
