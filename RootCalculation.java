// Root calculation using the bisection method

import java.util.Scanner;

public class RootCalculation {
    public static void main (String[] args) {
        double number;

        System.out.println("Determining the root of a number");

        Scanner kbd = new Scanner(System.in);
        System.out.print("Number = ");
        number = kbd.nextInt();

        double a = 1;
        double b = number;
        final double EPSILON = 1e-10;
        while (b - a > EPSILON) {
            double x = (a + b) /2;
            if (x * x > number)
                b = x;
            else
                a = x;
        }

        double root = a;
        System.out.println("Root " + number + " = " + root);
        System.out.println("Results via sqrt() = " + Math.sqrt(number));
    }
}