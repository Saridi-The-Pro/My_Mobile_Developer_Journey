// Series 1 3 6 10 15 21 28 36 45 55...

import java.util.Scanner;

public class RisingSeries {
    public static void main (String[] args) {
        int n;

        System.out.println("Series 1 3 6 10 15 21 28 36 45 55...");
        System.out.println("------------------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        int number = 0;
        for (int term = 1; term <= n; term++) {
            number = number + term;
            System.out.print(number + " ");
        }

        System.out.println();
    }
}