// Presentation of a series of n odd numbers
//   using do...while
//   version 2

import java.util.Scanner;

public class NOddNumber2 {
    public static void main (String[] args) {
        int number;
        int n;

        System.out.println("Series of N odd numbers");
        System.out.println("=======================");

        Scanner kbd = new Scanner(System.in);
        System.out.print("N = ");
        n = kbd.nextInt();

        number = 1;
        do {
            System.out.print(number + " ");

            number = number + 2;
        } while (number <= 2 * n - 1);

        System.out.println(); // Move line
    }
}
