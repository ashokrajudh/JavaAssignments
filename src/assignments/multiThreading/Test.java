package assignments.multiThreading;

public class Test {

    public static void main(String[] args) {

        World world = new World();
        world.start();

        Universe universe = new Universe();
        Thread t1 = new Thread(universe);
        t1.start();

         for(int i=0; i < 10000; i++)
         {
             System.out.println(Thread.currentThread().getName());
         }
    }
}
