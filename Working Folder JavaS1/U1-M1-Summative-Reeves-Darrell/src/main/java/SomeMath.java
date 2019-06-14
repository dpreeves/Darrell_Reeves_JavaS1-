public class SomeMath {
    public static void main(String[] args) {
        total5(1, 2, 3, 4, 5);
        average5(1, 3, 5, 7, 9);
        largest5(42.0, 35.1, 2.3, 40.2, 15.6);
    }

    public static int total5(int a, int b, int c, int d, int e) {
        int total = a + b + c + d + e;
        System.out.println("Total = " + total);
        return total;

    }

    public static double average5(int a, int b, int c, int d, int e) {
        double average = (a + b + c + d + e) / 5;
        System.out.println("Average = " + average);
        return average;
    }

    public static double largest5(double a, double b, double c, double d, double e) {
        double[] input = new double[]{a, b, c, d, e};
        double largest = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > largest) {
                largest = input[i];
            }

        }
        System.out.println("Largest = " + largest);
        return largest;
    }
}

