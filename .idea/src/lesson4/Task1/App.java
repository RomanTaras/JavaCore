package lesson4.Task1;

public class App {

    public static void main(String[] args) {

        Robot r1 = new Robot();
        r1.work();

        CoffeeRobot r2 = new CoffeeRobot();
        r2.work();

        RobotCocker r3 = new RobotCocker();
        r3.work();

        RobotDancer r4 = new RobotDancer();
        r4.work();

        Object[] r2d2 = {r1, r2, r3, r4};
        for (Object e : r2d2) {
            System.out.println(e);
        }

    }
}






