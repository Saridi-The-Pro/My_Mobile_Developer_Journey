// Example of making a box

import java.util.Scanner;

public class Square {
    public static void main (String[] args) {
        int n;

        System.out.println("Making square");
        System.out.println("-------------");

        Scanner kbd = new Scanner(System.in);

        System.out.print("n (greater than 2) = ");
        n = kbd.nextInt();

        // Show 2 n symbols *
        for (int column = 1; column <= 2 * n; column ++)
            System.out.print("*");
        
        System.out.println(); // Move line

        // Show one symbol *
        //    followed by a number of spaces
        //    and one symbol *
        for (int index = 1; index <= n - 2; index++) {
            System.out.print("*");

            for (int column = 1; column <= 2 * n -2; column++)
                System.out.print(" "); // Space character
            
            System.out.println("*");
        }

        // Show 2 n symbols *
        for (int column = 1; column <= 2 * n; column++)
            System.out.print("*");

        System.out.println(); // Move line
    }
}