package assignments.javafundementals;

import java.util.Arrays;

public class InsertElement {


    static int[] numbers = {10, 20, 30, 40};
    static int newValue = 25;
    static int posistion = 2;


    public static void main(String[] args) {

        System.out.println(Arrays.toString(insertElement(newValue, posistion)));
    }

    public static int[] insertElement(int newValue, int posistion) {
        int[] updatedNumbers = new int[numbers.length + 1];

        for (int i = 0, j=0; i < updatedNumbers.length; i++) {
            if (i == posistion) {
                updatedNumbers[i] = newValue;
            } else  {
                updatedNumbers[i] = numbers[j];
                j++;
            }
        }

        return updatedNumbers;
    }
}
