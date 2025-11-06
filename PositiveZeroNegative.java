// Determining negative, zero, and positive numbers

import java.util.Scanner;

public class PositiveZeroNegative {
    public static void main (String[] args) {
        System.out.println("Negative, zero, and positive numbers");
        System.out.println("------------------------------------");

        double number;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Number = ");
        number = kbd.nextDouble();

        // Determining negative, zero, and positive numbers
        if (number < 0)
            System.out.println("Negative number");
        else
            if (number == 0)
                System.out.println("Zero number");
            else
                System.out.println("Positive number");
    }
}