// Highest common factor

import java.util.Scanner;

public class HCF {
    public static void main (String[] args) {
        int x, y, a, b, remains;

        System.out.println("Highest common factor");
        System.out.println("Number x and y");
        System.out.println("---------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("x = ");
        x = kbd.nextInt();

        System.out.print("y = ");
        y = kbd.nextInt();

        // Get the largest and smallest numbers
        if (x > y) {
            a = x;
            b = y;
        }
        else {
            a = y;
            b = x;
        }

        // Obtain the highest common factor
        remains = a % b;
        while (remains != 0) {
            a = b;
            b = remains;
            remains = a % b;
        }

        System.out.println("HCF = " + b);
    }
}