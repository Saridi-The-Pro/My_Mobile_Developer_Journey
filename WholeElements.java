// Example of using length

public class WholeElements {
    public static void main (String[] args) {
        System.out.println("Example of length()");
        System.out.println("-------------------");

        int number[] = {1, 2, 5, 3};
        int data[] = {50, 77, 30, 1, 22};

        // Whole elements in arrays of numbers and data
        System.out.println("Enumeration of array of numbers = " + number.length);
        System.out.println("Enumerate data arrays = " + data.length);

        // Presenting data via length
        System.out.println();

        System.out.println("Data in the data array:");
        for (int index = 0; index < data.length; index++)
            System.out.println(data[index]);
    }
}