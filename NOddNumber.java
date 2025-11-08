// Presentation of a series of n odd numbers
//    using do...while

import java.util.Scanner;

public class NOddNumber {
    public static void main (String[] args) {
        int count;
        int n;

        System.out.println("Series of N odd numbers");
        System.out.println("=======================");

        Scanner kbd = new Scanner(System.in);
        System.out.print("N = ");
        n = kbd.nextInt();

        count = 1;
        do {
            System.out.print((2 * count - 1) + " ");
            count = count + 1;
        } while (count <= n);
        
        System.out.println(); // Move line
    }
}