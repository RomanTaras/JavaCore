package lesson5.Task4;

public class Human {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName) {
        this(firstName,null,0);
    }

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
