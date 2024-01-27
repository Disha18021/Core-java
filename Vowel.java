import java.util.Scanner;

class Vowel {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Accept a character from the user
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Check if the input character is a vowel or consonant
        if ((inputChar >= 'a' && inputChar <= 'z') || (inputChar >= 'A' && inputChar <= 'Z')) {
            // Convert to lowercase for simplicity
            char lowercaseChar = Character.toLowerCase(inputChar);

            // Check if it's a vowel
            if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' ||
                lowercaseChar == 'o' || lowercaseChar == 'u') {
                System.out.println(inputChar + " is a vowel.");
            } else {
                System.out.println(inputChar + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid character.");
        }

        scanner.close();
    }
}

