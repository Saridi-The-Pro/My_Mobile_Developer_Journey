// Presentation of a series of n odd numbers
//    using for

import java.util.Scanner;

public class ForOdd {
    public static void main (String[] args) {
        int n;

        System.out.println("Series of N odd number");
        System.out.println("======================");

        Scanner kbd = new Scanner(System.in);
        System.out.print("N = ");
        n = kbd.nextInt();

        for (int count = 1; count <= n; count ++)
            System.out.print((2 * count - 1) + " ");

        System.out.println(); // Move line
    }
}