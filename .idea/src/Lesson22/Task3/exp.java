package Lesson22.Task3;

public class exp {
    public static void main(String[] args) {

        FloatDataType floatDataTypeMin = x -> Float.MIN_VALUE;
        FloatDataType floatDataTypeMax = x -> Float.MIN_VALUE;
        DoubleDataType doubleDataTypeMin = x -> Double.MIN_VALUE;
        DoubleDataType doubleDataTypeMax = x -> Double.MIN_VALUE;

        System.out.println("Math.exp min_float(" + floatDataTypeMin.floatValues(Float.MIN_VALUE) + ")=" +
                Math.exp(Float.MIN_VALUE));
        System.out.println("Math.exp max_float(" + floatDataTypeMax.floatValues(Float.MAX_VALUE) + ")=" +
                Math.exp(Float.MAX_VALUE));
        System.out.println("Math.exp min_double(" + doubleDataTypeMin.doubleValues(Double.MIN_VALUE) + ")=" +
                Math.exp(Double.MIN_VALUE));
        System.out.println("Math.exp max_double(" + doubleDataTypeMax.doubleValues(Double.MAX_VALUE) + ")=" +
                Math.exp(Double.MAX_VALUE));
    }
}
