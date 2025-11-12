// Calculation of the total number of odd numbers from
//    10 integers are generated
//    randomly

import java.util.Random;

public class WholeOdd {
    public static void main (String[] args) {
        final int NUM_OF_DATA = 10;
        int[] data = new int[NUM_OF_DATA];

        // Create 10 random numbers between 0 and 100
        Random random = new Random();
        for (int index = 0; index < NUM_OF_DATA; index++)
            data[index] = random.nextInt(100 + 1);
        
        // Count the odd whole numbers in an array
        int whole = 0;
        for (int index = 0; index < NUM_OF_DATA; index++)
            if (data[index] % 2 == 1)
                whole++;
        
        // Display array and count of odd numbers
        System.out.println("List of random values: ");

        for (int index = 0; index < NUM_OF_DATA; index++)
            System.out.print(data[index] + " ");
        
        System.out.println();
        System.out.println("Whole number count = " + whole);
    }
}