package assignments.locks;

public class Main {

    public static void main(String[] args) {
         BankAccount hdfc = new BankAccount();
         Runnable task = new Runnable() {
             @Override
             public void run() {
                 hdfc.withdraw(50);
             }
         };

         Thread t1 = new Thread(task);
         Thread t2 = new Thread(task);
         t1.start();
         t2.start();

    }
}
