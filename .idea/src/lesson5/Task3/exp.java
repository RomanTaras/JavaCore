package lesson5.Task3;

public class exp {
    public static void main(String[] args) {

        float min_float = Float.MIN_VALUE;
        float max_float = Float.MAX_VALUE;
        double min_double = Double.MIN_VALUE;
        double max_double = Double.MAX_VALUE;

        System.out.println("Math.exp min_float(" + min_float + ")=" + Math.exp(min_float));
        System.out.println("Math.exp max_float(" + max_float + ")=" + Math.exp(max_float));
        System.out.println("Math.exp min_double(" + min_double + ")=" + Math.exp(min_double));
        System.out.println("Math.exp max_double(" + max_double + ")=" + Math.exp(max_double));
    }
}
