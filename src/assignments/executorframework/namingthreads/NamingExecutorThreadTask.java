package assignments.executorframework.namingthreads;

import java.util.concurrent.TimeUnit;

public class NamingExecutorThreadTask implements Runnable{

    private static int count = 0;
    private int instanceNumber;
    private String taskid;


    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("#### [" + currentThreadName + "] <Task-" + taskid + "> STARTING ####");

        for (int i = 10; i > 0; i--) {
            System.out.println("[" + currentThreadName + "]< " + taskid + "> WITH ITERATION VALUE- " + i);

            try {

                TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

        System.out.println("***** [" + currentThreadName + "] <TASK-" + taskid + "> COMPLETED ******");
    }

    public NamingExecutorThreadTask()
    {
        this.instanceNumber = ++count;
        this.taskid = "NamingThreadTechnique1" + instanceNumber;
    }
}
