package lesson6.Calculator1;

import Calculator.Numerable;

public class MyCalculator implements Numerable {

    @Override
    public double getDevide(double a1, double a2) {
        System.out.println(a1 + " / " + a2 + " = " + (a1 / a2));
        return 0;

    }

    @Override
    public double getMinus(double a1, double a2) {
        System.out.println(a1 + " - " + a2 + " = " + (a1 - a2));
        return 0;
    }

    @Override
    public double getMultiply(double a1, double a2) {
        System.out.println(a1 + " * " + a2 + " = " + (a1 * a2));
        return 0;
    }

    @Override
    public double getPlus(double a1, double a2) {
        System.out.println(a1 + " + " + a2 + " = " + (a1 + a2));
        return 0;
    }

    public static void main(String[] args) {
        MyCalculator pm = new MyCalculator();
        pm.getDevide(28, 7);
        pm.getPlus(5, 6);
        pm.getMinus(5, 8);
        pm.getMultiply(3, -3);
    }
}

