package assignments.locks;

public class DeadLockExample extends Thread{

    DeadLockClassA a = new DeadLockClassA();
    DeadLockClassB b = new DeadLockClassB();

    public void m1()
    {
        this.start();
        a.d1(b);
    }

    @Override
    public void run() {
        b.d2(a);
    }

    public static void main(String[] args) {
        DeadLockExample d = new DeadLockExample();
        d.m1();
    }
}
