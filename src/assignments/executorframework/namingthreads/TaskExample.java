package assignments.executorframework.namingthreads;

public class TaskExample {

    public static void main(String[] args) {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("[" + currentThreadName + "]Main Thread starts here...");

            new Thread(new NamingThreadTechnique1()).start();
            Thread t2 = new Thread(new NamingThreadTechnique1());
            t2.start();

        System.out.println("[" + currentThreadName + "]Main Thread ends here...");
    }
}
