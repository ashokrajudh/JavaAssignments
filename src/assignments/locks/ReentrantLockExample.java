package assignments.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample extends Thread {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Outer Method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner Method");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        ReentrantLockExample thread1 = new ReentrantLockExample();
        ReentrantLockExample thread2 = new ReentrantLockExample();

        thread1.start();
        thread2.start();

    }

    @Override
    public void run() {
        outerMethod();
    }
}
