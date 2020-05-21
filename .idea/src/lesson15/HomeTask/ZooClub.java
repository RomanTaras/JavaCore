package lesson15.HomeTask;

import java.util.*;


public class ZooClub {

    Map<Person, List<Animal>> zooClubMap = new HashMap<>();

    private Person findPersonKey(String name) {

        for (Person person : zooClubMap.keySet()) {

            if (person.getName().equals(name)) {

                return person;
            }
        }
        return null;
    }

    void addPersonToClub(String name, int age) {
        zooClubMap.put(new Person(name, age), new ArrayList<Animal>());
    }

    void addAnimalToPerson(String name, String typeOfAnimal, String nameOfAnimal) {
        String a = zooClubMap.keySet().iterator().next().getName();
        zooClubMap.get(findPersonKey(name)).add(new Animal(typeOfAnimal, nameOfAnimal));
    }

    void removeAnimal(String name, String typeOfAnimal, String nameOfAnimal) {
        zooClubMap.get(findPersonKey(name)).remove(new Animal(typeOfAnimal, nameOfAnimal));
    }

    void removePersonFromClub(String name) {
        zooClubMap.remove(findPersonKey(name));
    }

    void removeAllAnimals(String typeOfAnimal) {
        String a = String.valueOf(zooClubMap.values().iterator().next().remove(typeOfAnimal));
        if (typeOfAnimal.matches(a)) {
            for (List<Animal> value : zooClubMap.values()) {
                value.remove(typeOfAnimal);
            }
        }

    }

    void showAllZooClub() {
        System.out.println(zooClubMap);
    }
}



