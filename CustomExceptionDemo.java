class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            int number = -5;
            if (number < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed");
            }
            System.out.println("Number is: " + number);
        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}