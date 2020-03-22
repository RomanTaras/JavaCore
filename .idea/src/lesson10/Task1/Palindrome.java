package lesson10.Task1;

public class Palindrome {
    public static void main(String[] args) {
        String first = "SpOOn";
        String second = "rOToR";
        String m1 = first.toUpperCase();
        String m2 = second.toUpperCase();
        int p1 = m1.length();
        int p2 = m2.length();
        if (p1 == p2) {
            System.out.println("Entered verbs are palindrome");
        } else {
            System.out.println("Entered verbs are not palindrome");
        }
    }
}
