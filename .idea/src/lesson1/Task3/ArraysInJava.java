package lesson1.Task3;

import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        int[] array1 = {5, 17, 5, 1500, 13, 130, 18, 28, 1, 25};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("Minimum = " + array1[0]);
        System.out.println("Maximum = " + array1[array1.length - 1]);
    }
}


