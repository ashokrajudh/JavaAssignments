package assignments.javafundementals;

public class TypeCastingDemo {

    public static void main(String[] args) {

          int intValue = 100;
          double doubleValue = intValue;

        System.out.println("Implicit Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);

        double price = 99.99;
        int roundedPrice = (int) price;  // manual
        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + price);
        System.out.println("int value: " + roundedPrice);

    }
}
