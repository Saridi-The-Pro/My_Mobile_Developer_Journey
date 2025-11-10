// Pi value calculation

import java.util.Scanner;
import java.lang.Math;

public class PiCalculation {
    public static void main (String[] args) {
        int n;

        System.out.println("Pi value calculation");
        System.out.println("--------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        double amount = 1;

        for (int term = 2; term <= n; term++) {
            amount = amount + 1.0 / (term * term);
        }

        double pi = Math.sqrt(6 * amount);

        System.out.println("pi = " + pi);
    }
}