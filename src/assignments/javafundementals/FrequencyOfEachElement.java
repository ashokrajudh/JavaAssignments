package assignments.javafundementals;

public class FrequencyOfEachElement {

    static int[] numbers = {10, 20, 20, 10, 30, 10};


    public static void main(String[] args) {

        occurenceOfEachElement(numbers);
    }

    public static void occurenceOfEachElement(int [] numbers)

    {
        boolean[] counted = new boolean[numbers.length];



        for(int i=0; i< numbers.length; i++) {

            if(counted[i] == true) continue;

            int NumberOfTimesOccured = 1;

            for(int j=i+1; j < numbers.length; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    NumberOfTimesOccured ++;
                    counted[j] = true;
                }
            }
            System.out.println(numbers[i] + " occurs " + NumberOfTimesOccured + " times");
        }

    }
}
