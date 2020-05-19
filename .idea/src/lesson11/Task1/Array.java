package lesson11.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i, (int) ((Math.random() * 101)));
        }
        System.out.println("My array list: " + list);
        Collections.sort(list);

        System.out.println("My sorted list " + list);

        Collections.reverse(list);
        System.out.println("My reverse order sorted list" + list);
    }

}


