//Data entry into the matrix via keyboard

import java.util.Scanner;

public class Input2Dim {
    public static void main (String[] args) {
        System.out.println("Example of data entry into a matrix");
        System.out.println("-----------------------------------");

        int[][] matriks = new int [3][4];

        // Data entry
        Scanner kbd = new Scanner(System.in);
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 4; column++) {
                System.out.print("Data line " + (line + 1) + ", column " + (column + 1) + " = ");
                matriks[line][column] = kbd.nextInt();
            }
        }

        // Data presentation
        System.out.println();
        System.out.println("Data on the matrix:");

        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 4; column++)
                System.out.printf("%4d", matriks[line][column]);
            
            System.out.println(); // Move line
        }
    }
}