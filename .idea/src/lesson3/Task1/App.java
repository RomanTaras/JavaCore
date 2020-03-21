package lesson3.Task1;

public class App {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.5, 9.6);
        String a = r1.area1();
        String p = String.valueOf(r1.perimetr());

        Rectangle r2 = new Rectangle();
        r2.area();
    }
}

