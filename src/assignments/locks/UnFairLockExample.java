package assignments.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnFairLockExample {

    private static final Lock unfair = new ReentrantLock(false);

    public void accessResource()
    {
         unfair.lock();
         try{

             System.out.println(Thread.currentThread().getName() + " acquired the lock");
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         } finally
         {
             System.out.println(Thread.currentThread().getName() + " released the Lock. ");
             unfair.unlock();
         }
    }

    public static void main(String[] args) {

        UnFairLockExample example = new UnFairLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");
        Thread thread4 = new Thread(task, "Thread 4");


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();



    }
}
