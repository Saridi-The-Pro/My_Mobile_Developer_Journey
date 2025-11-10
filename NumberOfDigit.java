// Calculation of the number of digits

import java.util.Scanner;

public class NumberOfDigit {
    public static void main (String[] args) {
        int number;
        System.out.println("Calculation of the number of digits");
        System.out.println("-----------------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("Number = ");
        number = kbd.nextInt();

        int numberOfDigit = 0;

        do {
            numberOfDigit++;

            number = number / 10;
        } while (number != 0);

        System.out.println("Number of digit = " + numberOfDigit);
    }
}