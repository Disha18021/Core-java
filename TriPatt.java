import java.util.Scanner;

class TriPatt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of rows from the user
        System.out.print("Enter the number of rows for the triangle: ");
        int numRows = scanner.nextInt();

        // Print the triangle pattern
        printTriangle(numRows, 1);

        scanner.close();
    }

    // Recursive method to print the triangle
    private static void printTriangle(int numRows, int currentRow) {
        if (currentRow <= numRows) {
            printSpaces(numRows - currentRow);
            printDollars(2 * currentRow - 1);
            System.out.println();
            printTriangle(numRows, currentRow + 1);
        }
    }

    // Recursive method to print spaces
    private static void printSpaces(int numSpaces) {
        if (numSpaces > 0) {
            System.out.print(" ");
            printSpaces(numSpaces - 1);
        }
    }

    // Recursive method to print dollar signs
    private static void printDollars(int numDollars) {
        if (numDollars > 0) {
            System.out.print("*");
            printDollars(numDollars - 1);
        }
    }
}
