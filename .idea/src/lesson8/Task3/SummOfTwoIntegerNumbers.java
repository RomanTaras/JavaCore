package lesson8.Task3;

import java.util.Scanner;

public class SummOfTwoIntegerNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the first number - ");
        Scanner n1 = new Scanner(System.in);
        double number = n1.nextDouble();
        if (number == (int) number) {
            System.out.println("Entered number is integer");
        } else {
            System.out.println("Entered number is notinteger! Try again");
        }
        System.out.println("Enter the second number = ");
        Scanner n2 = new Scanner(System.in);
        double number1 = n2.nextDouble();
        if (number1 == (int) number1) {
            System.out.println("Entered number is integer");
        } else {
            System.out.println("Entered number is notinteger! Try again");
        }
        System.out.println(number + " + " + number1 + " = " + (number + number1));

    }
}

