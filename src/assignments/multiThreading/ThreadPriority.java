package assignments.multiThreading;

public class ThreadPriority extends Thread {

    ThreadPriority(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority()
                    + "-count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority("High Priority Thread");
        ThreadPriority t2 = new ThreadPriority("Normal Priority Thread");
        ThreadPriority t3 = new ThreadPriority("Low Priority Thread");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
