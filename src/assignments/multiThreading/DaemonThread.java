package assignments.multiThreading;

public class DaemonThread extends Thread{

    @Override
    public void run() {
        System.out.println("Daemon Thread Running ...");
    }

    public static void main(String[] args) {

        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main Thread Done");

    }
}
