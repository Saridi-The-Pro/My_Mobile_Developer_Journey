// Example of initializing a three-dimensional array

public class Init3Dim {
    public static void main(String[] args) {
        System.out.println("Initialization of a three-dimensional array");
        System.out.println("-------------------------------------------");

        int [][][] cell = {
            {{1, 71}, {2, 72}, {3, 73}, {4, 74}},
            {{5, 75}, {6, 76}, {7, 77}, {8, 78}},
            {{9, 79}, {10, 80}, {11, 81}, {12, 82}}
        };

        // Data presentation
        System.out.println();
        System.out.println("Data in cell array:");

        for (int layer = 0; layer < 2; layer ++) {
            System.out.println("Layer " + (layer + 1) + ":");
            for (int line = 0; line < 3; line++) {
                for (int columnn = 0;columnn < 4; columnn++)
                    System.out.printf("%4d", cell[line][columnn][layer]);
                
                System.out.println(); // Move line
            }

            System.out.println(); // Move line
        }
    }
}