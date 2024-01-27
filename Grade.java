import java.util.Scanner;

class Grade {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Accept SGPI from the user
        System.out.print("Enter SGPI (between 0 and 10): ");
        double sgpi = scanner.nextDouble();

        // Validate SGPI range
        if (sgpi < 0 || sgpi > 10) {
            System.out.println("Invalid SGPI. Please enter a value between 0 and 10.");
        } else {
            // Determine the grade based on SGPI
            char grade;
            if (sgpi >= 9.0) {
                grade = 'O';
            } else if (sgpi >= 8.0) {
                grade = 'A';
            } else if (sgpi >= 7.0) {
                grade = 'B';
            } else if (sgpi >= 6.0) {
                grade = 'C';
            } else if (sgpi >= 5.0) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display the grade
            System.out.println("Your Grade: " + grade);
        }

        scanner.close();
    }
}
