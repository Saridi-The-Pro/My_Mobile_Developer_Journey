// Example of a three-dimensional array

public class ThreeDimArray {
    public static void main (String[] args) {
        System.out.println("Example of a three-dimensional array");
        System.out.println("------------------------------------");

        int[][][] cell = new int[3][4][2];

        // Filling in the first line of the first layer of data
        cell[0][0][0] = 1;
        cell[0][1][0] = 2;
        cell[0][2][0] = 3;
        cell[0][3][0] = 4;
        
        // Fill in the data for the second row of the first layer
        cell[1][0][0] = 5;
        cell[1][1][0] = 6;
        cell[1][2][0] = 7;
        cell[1][3][0] = 8;

        // Filling in the data of the third row of the first layer
        cell[2][0][0] = 9;
        cell[2][1][0] = 10;
        cell[2][2][0] = 11;
        cell[2][3][0] = 12;

        // Fill in the data for the first row of the second layer
        cell[0][0][1] = 71;
        cell[0][1][1] = 72;
        cell[0][2][1] = 73;
        cell[0][3][1] = 74;

        // Fill in the second row of data for the second layer
        cell[1][0][1] = 75;
        cell[1][1][1] = 76;
        cell[1][2][1] = 77;
        cell[1][3][1] = 78;

        // Filling in the data of the third row of the second layer
        cell[2][0][1] = 79;
        cell[2][1][1] = 80;
        cell[2][2][1] = 81;
        cell[2][3][1] = 82;

        // Data presentation
        System.out.println();
        for (int layer = 0; layer < 2;layer++) {
            System.out.println("Layer " + (layer + 1) + ":");
            for (int line = 0; line < 3; line++) {
                for (int column = 0; column < 4; column++)
                    System.out.printf("%4d", cell[line][column][layer]);
                
                System.out.println(); // Move line
            }

            System.out.println(); // Move line
        }
    }
}