// Multiplication table

import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String[] args) {
        int n;

        System.out.println("Multiplication table");
        System.out.println("--------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        System.out.print("    ");
        for (int column = 1; column <= n; column++)
            System.out.printf("%3d ", column);
        
        System.out.println();

        for (int line = 1; line <= n; line++) {
            System.out.printf("%3d ", line);

            for (int column = 1; column < line; column++)
                System.out.print("    ");
            
            for (int column = line; column <= n; column++)
                System.out.printf("%3d ", line * column);
            
            System.out.println();
        }
    }
}