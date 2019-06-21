public class Calculator {
    public Calculator() {
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) { return a + b; }


    public static int subtract(int a, int b) {
        return a - b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("1 + 1 = " + add(1,1));
        System.out.println("23 - 52 = " + subtract(23,52));
        System.out.println("34 * 2 = " + multiply(34,2));
        System.out.println("12 / 3 = " + divide(12,3));
        System.out.println("12 / 7 = " + divide(12.0,7.0));
        System.out.println("3.4 + 2.3 = " + add(3.4,2.3));
        System.out.println("6.7 * 4.4 = " + multiply(6.7,4.4));
        System.out.println("5.5 - 0.5 = " + subtract(5.5,0.5));
        System.out.println("10.8 / 2.2 = " + divide(10.8,2.2));

    }
}
