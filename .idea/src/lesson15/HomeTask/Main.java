package lesson15.HomeTask;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        zooClub.addPersonToClub("Igor",18);
        zooClub.showAllZooClub();
        zooClub.addPersonToClub("Semen",44);
        zooClub.addPersonToClub("Zenuk",20);
        zooClub.showAllZooClub();
        zooClub.addAnimalToPerson("Igor","dog","barsik");
        zooClub.showAllZooClub();
        zooClub.addAnimalToPerson("Igor","cat","sebastian");
        zooClub.showAllZooClub();
        zooClub.removeAnimal("Igor","dog","barsik");
        zooClub.showAllZooClub();
        zooClub.removeAllAnimals("dog");



    }
}
