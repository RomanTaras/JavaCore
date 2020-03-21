package lesson3.Task2;

public class Circle {
    public double radius;
    public double diametr;

    public Circle (){

    }

    public Circle(double radius, double diametr) {
        this.radius = radius;
        this.diametr = diametr;
    }
    double getArea (){
        return (Math.PI*diametr*diametr)/4;

    }
    double getLength (){

        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "radius = " + radius +
                ", diametr = " + diametr +
                '}';
    }
}

