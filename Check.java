import java.util.Scanner;
class Check {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Declare a variable of byte data type
        byte byteValue;

        // Accept a value from the user
        System.out.print("Enter a value for byte: ");
        byteValue = scanner.nextByte();

        // Check whether the value is a whole number or not
        if (byteValue >=0) {
            System.out.println("The entered value is a whole number.");
        } else {
            System.out.println("The entered value is not a whole number.");
        }

        scanner.close();
    }
}
