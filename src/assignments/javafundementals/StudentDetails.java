package assignments.javafundementals;

import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Student Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Student Grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("\n--- Student Details ---");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Grade : " + grade);

        sc.close();


    }
}
