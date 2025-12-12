// Matrix addition

public class SumMatrix {
    public static void main (String[] args) {
        final int NUMBER_LINES = 3;
        final int NUMBER_COLUMNS = 3;

        int[][] matrixA = {
            {1, 3, 2},
            {4, 6, 5},
            {9, 7, 8}
        };

        int[][] matrixB = {
            {8, -1, 4},
            {-7, 3, -6},
            {9, -2, 5}
        };

        // Presentation of the sum of matrix A and matrix B
        for (int line = 0; line < NUMBER_LINES; line++) {
            for (int column = 0; column < NUMBER_COLUMNS; column++)
                System.out.printf("%4d", matrixA[line][column] + matrixB[line][column]);
            System.out.println();
        }
    }
}