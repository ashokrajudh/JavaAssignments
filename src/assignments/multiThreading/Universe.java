package assignments.multiThreading;

public class Universe implements Runnable{

    public void run()
    {
        for(int i = 0; i < 10000; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
