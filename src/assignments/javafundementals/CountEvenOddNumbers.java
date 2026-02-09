package assignments.javafundementals;

public class CountEvenOddNumbers {

    static int[] numbers = {1,2,3,4,5,6};

    public static void main(String[] args) {
        System.out.println(countEvenAndOdd(numbers));
    }

    public static String countEvenAndOdd(int [] numbers)
    {

           int EvenCount = 0;
           int OddCount = 0;

        for(int i=0; i< numbers.length; i++)
        {
            if(numbers[i] % 2 == 0)
            {
                EvenCount ++;
            }

            else {

                OddCount ++;
            }
        }

        return "Even Number Count is " +EvenCount+ " & Odd Number Count is " +OddCount+"";
    }
}
