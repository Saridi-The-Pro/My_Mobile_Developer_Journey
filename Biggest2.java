// Determining the largest number
//     between two numbers
//     using if-else

import java.util.Scanner;

public class Biggest2 {
    public static void main (String[] args) {
        System.out.println("Largest number");
        System.out.println("between two integers");
        System.out.println("--------------------");

        int numberX, numberY, biggest;

        Scanner kbd = new Scanner(System.in);

        System.out.print("First number  = ");
        numberX = kbd.nextInt();

        System.out.print("Second number = ");
        numberY = kbd.nextInt();

        // Determining the largest number

        if (numberX > numberY)
            biggest = numberX;
        else
            biggest = numberY;
        
        // Show the results
        System.out.println("Biggest number = " + biggest);
    }
}