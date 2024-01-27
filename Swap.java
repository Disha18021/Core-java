import java.util.Scanner;
class Swap 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        // Declare variables of byte and short data types
        byte byteValue;
        short shortValue;

        // Accept values from the user
        System.out.print("Enter a value for byte: ");
        byteValue = scanner.nextByte();

        System.out.print("Enter a value for short: ");
        shortValue = scanner.nextShort();

        // Perform incrementation on byte value and decrementation on short value
        byteValue++;
        shortValue--;

        // Swap values without using a temporary variable
        byteValue = (byte) (byteValue + shortValue);
        shortValue = (short) (byteValue - shortValue);
        byteValue = (byte) (byteValue - shortValue);

        // Display the swapped values
        System.out.println("After swapping without temporary variable:");
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);

        scanner.close();
    }
}
