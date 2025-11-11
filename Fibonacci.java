// Fibonacci series

import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {
        int n;

        System.out.println("Deret fibonacci dengan n suku");
        System.out.println("=============================");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        int fn1 = 1;
        int fn2 = 1;

        System.out.print(1 + " ");
        System.out.print(1+ " ");;

        int fn = fn1 + fn2;
        int index = 3;
        while (index <= n) {
            System.out.print(fn + " ");

            fn1 = fn2;
            fn2 = fn;
            fn = fn1 + fn2;
            index = index + 1;
        }
    }
}