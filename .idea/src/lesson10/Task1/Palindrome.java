package lesson10.Task1;

import java.util.*;

public class Palindrome {
    private static String text;

    public static void main(String[] args) {
        System.out.println("Please enter two words contains of 5 letters for palindrome ckeck = ");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next().toLowerCase();
        String second = scanner.next().toLowerCase();

        if (first.toCharArray().length == 5 && second.toCharArray().length == 5) {

            String reverse1 = new StringBuilder(new String(first)).reverse().toString();
            String reverse2 = new StringBuilder(new String(second)).reverse().toString();


            if (first.matches(reverse1)) {
                System.out.println(first + " is palindrome");
            } else {
                System.out.println(first + " is not palindrome");
            }

            if (second.matches(reverse2)) {
                System.out.println(second + " is palindrome");
            }
            else {
                System.out.println(second + " is not palindrome");
            }
        }
        else {
            System.out.println("entered word doesn`t contains 5 letters");
        }
    }
}

