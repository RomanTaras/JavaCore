package Task1;

public abstract class Plane {
    int length;
    int width;
    int weight;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int i = 20 + (int) (Math.random() * 69);
    float d = (float) (Math.random() * 1001);

    public int getStartEngine() {
        System.out.println("Time before ready flights up = " + i + " s ");
        return 0;
    }

    public int getFlightsUp() {
        System.out.println("Distance run with full tank of fuel = " + d + " km ");
        return 0;
    }

    public String getLandind() {
        System.out.println("Plane approaches the landing");
        return null;
    }
}
