package assignments.locks;

public class DeadLockClassA {

    public synchronized void d1(DeadLockClassB b) {
        System.out.println("Thread 1 starts executing of d1() method");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread 1 trying to call b.last()");
        b.last();
    }

    public synchronized void last() {
        System.out.println("Inside A this is last() Method");
    }


}

class DeadLockClassB {

    public synchronized void d2(DeadLockClassA a) {
        System.out.println("Thread 2 starts executing of d2() method");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread 2 trying to call a.last()");
        a.last();
    }

    public synchronized void last() {
        System.out.println("Inside B this is last() Method");
    }
}
