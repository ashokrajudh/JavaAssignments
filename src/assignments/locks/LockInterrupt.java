package assignments.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterrupt {

    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() ->
        {
            lock.lock();
            try {
                System.out.println("Thread-1 acquired lock");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted");
            } finally {
                lock.unlock();
            }


        });

        Thread t2 = new Thread(() ->
        {
            try {
                System.out.println("Thread-2 trying acquired lock");
                lock.lockInterruptibly();
                try
                {
                    System.out.println("Thread-2 acquired lock");
                }finally {
                    lock.unlock();
                }

            } catch (InterruptedException e) {
                System.out.println("Thread-2 interrupted while waiting for lock");
            }

        });

        t1.start();
        Thread.sleep(500);
        t2.start();

        Thread.sleep(2000);
        t2.interrupt();

    }
}
