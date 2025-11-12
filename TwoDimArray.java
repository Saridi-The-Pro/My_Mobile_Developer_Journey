// Example of a two-dimensional array

public class TwoDimArray {
    public static void main (String[] args) {
        System.out.println("Example of a two-dimensional array");
        System.out.println("----------------------------------");

        int [][] matriks = new int[3][4];

        // Fill in the first line of data
        matriks[0][0] = 1;
        matriks[0][1] = 2;
        matriks[0][2] = 3;
        matriks[0][3] = 4;

        // Fill in the second line of data
        matriks[1][0] = 5;
        matriks[1][1] = 6;
        matriks[1][2] = 7;
        matriks[1][3] = 8;

        // Fill in the third line of data
        matriks[2][0] = 9;
        matriks[2][1] = 10;
        matriks[2][2] = 11;
        matriks[2][3] = 12;

        // Data presentation
        System.out.println();
        System.out.println("Data on the matrix");

        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 4; column++) {
                System.out.printf("%4d", matriks[line][column]);
            }
            System.out.println();
        }
    }
}