package lesson4.Task2;

public class SteeringWheel {
    private int diametr;
    private String shape;
    private String colour;

    public void changeDiametr() {
        System.out.println("diametr of steering wheel =" + diametr * 1.12);
    }


    public SteeringWheel(int diametr, String shape, String colour) {
        this.diametr = diametr;
        this.shape = shape;
        this.colour = colour;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
