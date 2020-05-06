package Lesson18.Task2;

import java.time.DayOfWeek;
import java.util.HashMap;

public class Map<K, V> {

    public static void main(String[] args) {
        HashMap j = new HashMap();

        for (int i = 1; i <= 7; i++) {
            j.put(i, DayOfWeek.of(i));
        }
        System.out.println("Map<K,V> = " + j);

        j.remove(1);

        System.out.println("Map <K,V> after removing first element by key" + j);

        while (j.values().remove("Tuesday")) ;

        System.out.println("Map after removing second element by value" + j);
        System.out.println("Key set of keys = " + j.keySet());
        System.out.println("List of values = " + j.values().toString());
        System.out.println("All Map = " + j);

    }
}
