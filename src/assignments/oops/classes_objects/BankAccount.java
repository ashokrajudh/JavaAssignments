package assignments.oops.classes_objects;

public class BankAccount {

    private String accountHolderName;
    private long accountNumber;

    private double currentBalance;


    BankAccount(String accountHolderName, long accountNumber, double currentBalance)
    {
          this.accountNumber = accountNumber;
          this.accountHolderName = accountHolderName;
          setCurrentBalance(currentBalance);
    }

    private void setCurrentBalance(double currentBalance)
    {
          this.currentBalance = currentBalance;
    }

    public void deposit(double depositAmount)
    {
          if(depositAmount > 0)
          {
             currentBalance+=depositAmount;
              System.out.println("Deposited Successfully, your current balance is: " + currentBalance);
          }

          else
          {
              System.out.println("Amount should be greater than 1 rupee");

          }
    }

    public void withdraw(double withdrawAmount)
    {
        if(withdrawAmount > 0 && withdrawAmount <=currentBalance)
        {
            currentBalance-=withdrawAmount;
            System.out.println("Amount Withdrawn Successfully, your current balance is: " + currentBalance);
        }
        else
        {
            System.out.println("Withdrawn Amount should be greater than 1 rupee or Less than equal to Available Balance");

        }
    }

    public void checkBalance()
    {
        System.out.println("Your Available Balance is : " + currentBalance);
    }


    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Ashok Raju", 002332145332, 4000);
        account1.deposit(1000.55);
        account1.withdraw(2000);
        account1.checkBalance();
        BankAccount account2 = new BankAccount("Ramesh", 745466646646l, 3550);
        account2.deposit(5000);
        account2.withdraw(2000);
        account2.checkBalance();
    }
}
