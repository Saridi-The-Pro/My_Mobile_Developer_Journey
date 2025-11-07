// Determining the smallest number
//    between three numbers
//    version 1

import java.util.Scanner;

public class Smallest {
    public static void main (String[] args) {
        System.out.println("Determining the smallest number");
        System.out.println("between three integers");
        System.out.println("-------------------------------");

        int numX, numY, numZ, smallest;

        Scanner kbd = new Scanner(System.in);

        System.out.print("First number = ");
        numX = kbd.nextInt();

        System.out.print("Second number = ");
        numY = kbd.nextInt();

        System.out.print("Third number = ");
        numZ = kbd.nextInt();

        // Determining the smallest number
        if (numX < numY && numX < numZ)
            smallest = numX;
        else
            if (numY < numX && numY < numZ)
                smallest = numY;
            else
                smallest = numZ;
        
        // Show the results
        System.out.println("Smallest number = " + smallest);
    }
}