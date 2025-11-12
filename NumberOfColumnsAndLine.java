// Application of length to two-dimensional arrays

public class NumberOfColumnsAndLine {
    public static void main (String[] args) {
        System.out.println("Length in a two-dimensional array");
        System.out.println("---------------------------------");

        int[][] matriks = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Data presentation
        System.out.println();
        System.out.println("Number of line = " + matriks.length);
        System.out.println("Number of column = " + matriks[0].length);
    }
}