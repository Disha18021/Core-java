public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // Accessing an index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index out of bounds");
        }

        try {
            int result = divideByZero(10, 0); // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero");
        }

        try {
            String str = null;
            System.out.println(str.length()); // Accessing a method on a null object
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Null pointer exception");
        }
    }

    public static int divideByZero(int dividend, int divisor) {
        return dividend / divisor;
    }
}