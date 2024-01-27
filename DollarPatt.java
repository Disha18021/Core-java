import java.util.Scanner;

class DollarPatt {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of rows from the user
        System.out.print("Enter the number of rows for the half triangle: ");
        int numRows = scanner.nextInt();

        // Print the triangle pattern
        printRow(1, numRows);

        scanner.close();
    }

    // Recursive method to print rows
    private static void printRow(int currentRow, int numRows) {
        if (currentRow <= numRows) {
            printDollars(1, currentRow);
            System.out.println();
            printRow(currentRow + 1, numRows);
        }
    }

    // Recursive method to print dollar signs in a row
    private static void printDollars(int currentCol, int maxCols) {
        if (currentCol <= maxCols) {
            System.out.print("$ ");
            printDollars(currentCol + 1, maxCols);
        }
    }
}
