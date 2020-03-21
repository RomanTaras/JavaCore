package lesson8.Task2;

import java.util.Scanner;

public class IntegerNumberEvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number = ");

        java.util.Scanner one = new Scanner(System.in);
        double number = one.nextDouble();

        if (number == (int) number) {
            System.out.println("Entered number is integer");
        } else {
            System.out.println("Entered number is notinteger! Try again");
        }

        if (number % 2 == 0) {
            System.out.println("The " + number + " is even");
        } else {
            System.out.println("The " + number + " is odd");
        }
    }
}


