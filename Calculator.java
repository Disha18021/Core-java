public class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Main method for testing
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Testing the overloaded methods
        System.out.println("Adding two integers: " + calculator.add(5, 3));
        System.out.println("Adding three integers: " + calculator.add(5, 3, 2));
        System.out.println("Adding two doubles: " + calculator.add(5.5, 3.7));
    }
}
