package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VerhovnaRada vr = new VerhovnaRada();
        System.out.println("Please enter = " +
                "\n1. for add fraction;" +
                "\n2. for delete fraction;" +
                "\n3. for show all fractions;" +
                "\n4. add deputy to fraction;" +
                "\n5. for show some fraction;" +
                "\n6. for remove deputy;" +
                "\n7. for show briber list;" +
                "\n8. for exit.");
        boolean val = true;
        while (val) {
            System.out.println("Make your integer choice");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case (1):
                    vr.addNewFraction();
                    break;
                case (2):
                    vr.removeFraction();
                    break;
                case (3):
                    vr.showAllFractions();
                    break;
                case (4):
                    vr.addDeputyToFraction();
                    break;
                case (5):
                    vr.showSomeFraction();
                    break;
                case (6):
                    vr.removeDeputyFromFraction();
                    break;
                case (7):
                    vr.listOfAllBribersInFraction();
                case (8):
                    System.exit(0);
                    break;
            }

        }
    }
}

