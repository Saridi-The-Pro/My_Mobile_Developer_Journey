// Degrees to radians conversion

import java.util.Scanner;

public class DegreesToRadians {
    public static void main (String[] args) {
        double degrees;

        Scanner kbd = new Scanner(System.in);

        System.out.println("Degrees to radians conversion");
        System.out.println("-----------------------------");

        System.out.print("Degrees = ");
        degrees = kbd.nextDouble();

        // Degrees to radians
        double radians = degrees * 0.017453277;

        // Show the results
        System.out.println("Radians = " + radians);
    }
}