package lesson15.HomeTask;

public class Person {
    public String name;
    public String age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;

    }
}


