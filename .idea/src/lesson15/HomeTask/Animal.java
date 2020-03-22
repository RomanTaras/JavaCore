package lesson15.HomeTask;

public class Animal {
    public String TypeOfAnimal;
    public String NameOfAnimal;

    public String getTypeOfAnimal() {
        return TypeOfAnimal;
    }

    public String getNameOfAnimal() {
        return NameOfAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "TypeOfAnimal='" + TypeOfAnimal + '\'' +
                ", NameOfAnimal='" + NameOfAnimal + '\'' +
                '}';
    }

    public Animal(String typeOfAnimal, String nameOfAnimal) {
        TypeOfAnimal = typeOfAnimal;
        NameOfAnimal = nameOfAnimal;

    }
}

