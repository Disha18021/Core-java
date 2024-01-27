import java.util.Scanner;

class Positive {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Accept a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number >= 0) {
            System.out.println("The entered number is positive.");
        } else if (number < 0) {
            System.out.println("The entered number is negative.");
        } else {
            System.out.println("The entered number is zero.");
        }

        scanner.close();
    }
}
