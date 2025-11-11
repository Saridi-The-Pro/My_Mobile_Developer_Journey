//Example of a one-dimensional array

public class OneDimArray {
    public static void main (String[] args) {
        System.out.println("Example of a one-dimensional array");
        System.out.println("----------------------------------");

        // Array declaration
        int[] data;

        // Array instantiation
        data = new int[5];

        // Data entry
        data[0] = 50;
        data[1] = 77;
        data[2] = 30;
        data[3] = 1;
        data[4] = 22;

        // Data presentation
        System.out.println();
        System.out.println("Data on the array");

        for (int index = 0; index < 5; index++)
            System.out.println(data[index]);
    }
}