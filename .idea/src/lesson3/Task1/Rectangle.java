package lesson3.Task1;

public class Rectangle {
    private double length;
    private double width;

    public void area() {
        System.out.println("Area of rectangle default  = " + length * width);
    }

    public String area1() {
        System.out.println("Area of rectangle = " + getLength() * getWidth());
        return null;

    }

    public double perimetr() {
        System.out.println("Perimetr of rectangle = " + 2 * (getWidth() + getLength()));
        return 0;
    }


    public Rectangle() {
        this.width = 2.5;
        this.length = 8.6;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }
}

