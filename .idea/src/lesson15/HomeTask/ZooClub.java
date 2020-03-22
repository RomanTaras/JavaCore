package lesson15.HomeTask;

import java.util.*;


public class ZooClub   {

    public static void main(String[] args) {

        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Petya","25"));
        personList.add(new Person("Oksana", "20"));
        personList.add(new Person("Sonya", "23"));

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Cat", "Sebastian"));
        animalList.add(new Animal("Dog", "Godzilla"));
        animalList.add(new Animal("Chinchilla", "Mika"));

        Map<String, String> map = new HashMap<>();

        for (Person person : personList) {
            map.put(person.getName(), person.getAge());
        }

        for (Animal animal : animalList) {
            map.put(animal.getNameOfAnimal(), animal.getTypeOfAnimal());
        }
        System.out.println("Map :" + map);

        animalList.remove(2);

        System.out.println("animalList afther removing one animal :" + animalList);

        personList.remove(0);
        System.out.println("Personlist afther removing member with index 0 " + personList.toString());
        map.remove("Mika","Chinchilla");
        System.out.println("Map :" + map);




    }
}
