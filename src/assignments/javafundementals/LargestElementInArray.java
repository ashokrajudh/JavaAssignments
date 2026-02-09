package assignments.javafundementals;

public class LargestElementInArray {

    static int[] numbers = {10, 5, 15, 8, 20};

        public static void main(String [] args)
    {

             System.out.print(largetNumber(numbers));

    }

    public static int largetNumber(int [] numbers)
    {
        int maximumNumber = Integer.MIN_VALUE;

          for(int i=0; i< numbers.length; i++)
          {
                if(numbers[i] > maximumNumber)
                {
                        maximumNumber = numbers[i];
                }
          }

          return maximumNumber;
    }
}
