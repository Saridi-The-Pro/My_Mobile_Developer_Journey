// Initialization of a one-dimensional array

public class Init1Dim {
    public static void main (String[] args) {
        System.out.println("Initialization of a one-dimensional array");
        System.out.println("-----------------------------------------");

        int[] data = {50, 77, 30, 1, 22};

        // Data presentation
        System.out.println();

        System.out.println("Data on the array:");

        for (int index = 0; index < 5; index++)
            System.out.println(data[index]);
    }
}