// Alternating positive negative series

import java.util.Scanner;

public class PositiveNegativeSeries {
    public static void main (String[] args) {
        int n;

        System.out.println("Series 1 -3 5 -7 9 -11...");
        System.out.println("-------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        int multiplier = -1;
        int number;

        for (int term = 1; term <= n; term++) {
            multiplier = -1 * multiplier;
            number = (2 * term -1) * multiplier;
            System.out.println(number);
        }
    }
}