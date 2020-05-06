package Lesson18.Task1;

import java.util.ArrayList;
import java.util.List;

public class AddStringToListInteger {
    public static void addToList(List list) {

        list.add(0, 1);
        list.add(1, "Trinity");
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        addToList(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list);
    }
}

