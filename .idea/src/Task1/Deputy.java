package Task1;

import java.util.*;

public class Deputy extends Human {
    public Deputy(int weight, int height, String carBrand) {
        super(weight, height, carBrand);
    }

    private String name;
    private String lastName;
    private int age;
    private boolean briber;
    private int bribeValue;

    public int getBribeValue() {
        return bribeValue;
    }

    public void setBribeValue() {
        this.bribeValue = bribeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Deputy(int weight, int height, String carBrand, String name, String lastName, int age, boolean briber) {
        super(weight, height, carBrand);
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.briber = briber;
    }
    public int giveBribe() {

    return this.bribeValue;
//        if (!this.briber) {
//            System.out.println("This deputy don`t give bribe");
//        } else {
//            System.out.println("Enter bribe value in $ :");
//            Scanner scanner = new Scanner(System.in);
//            int bribeSum = scanner.nextInt();
//
//            if (bribeValue>= 5000) {
//                System.out.println("Police get deputy!");
//            } else if (bribeValue < 5000) {
//                this.bribeValue = bribeSum;
//            }
//        }
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", briber=" + briber +
                ", bribeValue=" + bribeValue +
                '}';
    }
}
