public class TriangleFormatter {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle

        // Full Triangle
        System.out.println("Full Triangle:");
        for (int i = 1; i <= rows; i++) {
            String rowString = String.format("%" + (rows - i + 1) + "s", "")
                    .replace(' ', '*')
                    .replaceFirst("\\*", "");

            System.out.println(rowString);
        }

        // Reverse Triangle
        for (int i = rows; i >= 1; i--) {
            String rowString = String.format("%" + (rows - i + 1) + "s", "")
                    .replace(' ', '*')
                    .replaceFirst("\\*", "");

            System.out.println(rowString);
        }
    }
}