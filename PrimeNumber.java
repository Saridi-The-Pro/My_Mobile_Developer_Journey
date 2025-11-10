// Prime number

import java.util.Scanner;

public class PrimeNumber {
    public static void main (String[] args) {
        int n;

        System.out.println("Determining prime numbers");
        System.out.println("-------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("Number = ");
        n = kbd.nextInt();

        boolean prime = true;
        for (int num = 2; num <= n / 2; num++) {
            if (n % num == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " not a prime number");
    }
}