package TwoDArray;

public class SpiralMatrix {
    public static void main(String[] args) {
        int startRow = 0, endRow = 3, startCol = 0, endCol = 3;
    }
    public static void printSpiral(int[][] matrix) {
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Print top row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;

            // Print right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Print bottom row
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
                endRow--;
            }

            // Print left column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }
}