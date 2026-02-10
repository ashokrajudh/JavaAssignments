package assignments.multiThreading;

public class ThreadInterrupt extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running ... ");
        try {
            Thread.sleep(2000);
            System.out.println("Thread is After Sleep ... ");

        } catch (InterruptedException e) {

            System.out.println("Thread Interrupted: " +e);
        }
    }

    public static void main(String[] args) {
        ThreadInterrupt t1 = new ThreadInterrupt();
        t1.start();
        t1.interrupt();
    }
}
