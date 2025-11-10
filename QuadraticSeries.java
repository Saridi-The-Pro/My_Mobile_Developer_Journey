// Quadratic series

import java.util.Scanner;

public class QuadraticSeries {
    public static void main (String[] args) {
        int n;

        System.out.println("Quadratic Series");
        System.out.println("----------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        for (int term = 1; term <= n; term++) {
            System.out.println(term * term);
        }
    }
}