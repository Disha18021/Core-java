public class StaticMethod {

    // Static method to find the maximum of two integers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Static method to find the maximum of two doubles
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    // Main method for testing
    public static void main(String[] args) {
        int intMax = StaticMethod.max(5, 3);
        double doubleMax = StaticMethod.max(5.5, 3.7);

        System.out.println("Maximum of two integers: " + intMax);
        System.out.println("Maximum of two doubles: " + doubleMax);
    }
}
