// Entering data into an array via the keyboard

import java.util.Scanner;


public class OneDimInput {
    public static void main (String[] args) {
        System.out.println("Example of entering data into an array");
        System.out.println("--------------------------------------");

        int[] data = new int[5];

        // Data entry
        Scanner kbd = new Scanner(System.in);
        for (int index = 0; index < 5; index++) {
            System.out.print("Data " + (index + 1) + " = ");
            data[index] = kbd.nextInt();
        }

        // Data presentation
        System.out.println();

        System.out.println("Data on the array");
        for (int index = 0; index < 5; index++)
            System.out.println(data[index]);
    }
}