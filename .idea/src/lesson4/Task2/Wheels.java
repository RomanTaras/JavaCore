package lesson4.Task2;

public class Wheels {
    private String brand;
    private int diametr;
    private int SpeedIndex;

    public  void brand(){
        System.out.println("Tyre brand - Michelin");
    }
    public void diametr(){
        System.out.println("Tyre diametr -"+getDiametr());
    }
public void SpeedIndex(){
    System.out.println("Speed index - 240 km/h");
}
    public Wheels(String brand, int diametr, int speedIndex) {
        this.brand = brand;
        this.diametr = diametr;
        SpeedIndex = speedIndex;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getSpeedIndex() {
        return SpeedIndex;
    }

    public void setSpeedIndex(int speedIndex) {
        SpeedIndex = speedIndex;
    }
}
