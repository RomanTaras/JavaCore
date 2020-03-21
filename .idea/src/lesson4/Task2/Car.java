package lesson4.Task2;

public class Car {
    private String colour;
    private int age;
    private String vinCode;
    private String brand;

    public void colour() {
        System.out.println("colour - black");
    }

    public void age() {
        System.out.println("age - 3");
    }

    public void vinCode() {
        System.out.println("VIN code - XXX");
    }

    public void brand() {
        System.out.println("Brand - BMW");
    }


    public Car(String colour, int age, String vinCode, String brand) {
        this.colour = colour;
        this.age = age;
        this.vinCode = vinCode;
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        Car TypeX = new Car("Black", 1, "XXX", "BMW");
        TypeX.brand();
        TypeX.colour();
        TypeX.vinCode();
        TypeX.age();

        SteeringWheel w1 = new SteeringWheel(35, "circle", "black");
        w1.changeDiametr();

        Wheels W = new Wheels("Michelin", 22, 280);
        W.brand();
        W.diametr();
        W.SpeedIndex();


    }
}


