package assignments.javafundementals;

public class SecondLargestElement {

    static int[] numbers = {10, 5, 20, 8, 15};

        public static void main(String [] args)
    {

             System.out.print(largetNumber(numbers));

    }

    public static int largetNumber(int [] numbers)
    {
        int firstMaximumNumber = numbers[0];
        int secondMaximumNumber = Integer.MIN_VALUE;


        for(int i=0; i< numbers.length; i++)
          {
                if(numbers[i] > firstMaximumNumber )
                {
                    secondMaximumNumber = firstMaximumNumber;
                    firstMaximumNumber = numbers[i];
                }

                else if (numbers[i] > secondMaximumNumber && numbers[i] < firstMaximumNumber) {
                    secondMaximumNumber = numbers[i];
                }
          }

          return secondMaximumNumber;
    }
}
