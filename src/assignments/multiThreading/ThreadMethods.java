package assignments.multiThreading;

public class ThreadMethods extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running ....");
        for(int i=0; i < 5; i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(i);

        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadMethods t1 = new ThreadMethods();
          t1.start();
          t1.join();
    }
}
