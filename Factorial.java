// Calculation of n factorial

import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
        int n;

        System.out.println("Calculation n!");
        System.out.println("--------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        int result = 1;

        for (int num = 1; num <= n; num++)
            result = result * num;

        System.out.println(n + "! = " + result);
    }
}