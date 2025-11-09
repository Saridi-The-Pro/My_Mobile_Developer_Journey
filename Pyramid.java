// Example of making an inverted pyramid

import java.util.Scanner;

public class Pyramid {
    public static void main (String[] agrs) {
        int n;

        System.out.println("Making an inverted pyramid");
        System.out.println("--------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        for (int line = 1; line <= n; line++) {
            // Show space character
            for (int column = 1; column <= line - 1; column++)
                System.out.print(" "); // Space character
            
            // Show *
            for (int index = 1; index <= 2 * (n - line) + 1; index++)
                System.out.print("*"); // Symbol *
            
            System.out.println();
        }
    }
}