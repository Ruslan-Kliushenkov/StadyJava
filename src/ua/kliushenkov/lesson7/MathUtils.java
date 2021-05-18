package ua.kliushenkov.lesson7;

public final class MathUtils {
    private MathUtils() throws Exception {
        throw new Exception("Object of class MathUtils cannot be created");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static double div(int a, int b) {
        return (double) a / b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double multiplyAndsqrt(double a, double b) {
        return Math.sqrt(a * b);
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 5));
        System.out.println(div(1, 5));
        System.out.println(mult(1, 5));
        System.out.println(sub(1, 5));
        System.out.println(MathUtils.multiplyAndsqrt(2, 5));
    }
}
