// Presentation of a series of n odd numbers
//    using while - Version 2

import java.util.Scanner;

public class WhileOdd2 {
    public static void main (String[] args) {
        int number;
        int n;

        System.out.println("Series of N odd number");
        System.out.println("======================");

        Scanner kbd = new Scanner(System.in);

        System.out.print("N = ");
        n = kbd.nextInt();

        number = 1;
        while (number <= 2 * n - 1) {
            System.out.print(number + " ");

            number = number + 2;
        }
        
        System.out.println();
    }
}