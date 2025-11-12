// Example of initializing a two-dimensional array

public class Init2Dim {
    public static void main (String[] agrs) {
        System.out.println("Initializing a two-dimensional array");
        System.out.println("------------------------------------");

        int[][] matriks = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Data presentation
        System.out.println();
        System.out.println("Data on the matrix:");

        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 4; column++)
                System.out.printf("%4d", matriks[line][column]);

            System.out.println();
        }
    }
}