// Calculating the distance between two points

import java.util.Scanner;
import java.lang.Math;

public class Distances {
    public static void main (String[] args) {
        double x1, y1, x2, y2;

        Scanner kbd = new Scanner(System.in);

        System.out.println("The distance between two points");
        System.out.println("-------------------------------");

        System.out.print("X1 = ");
        x1 = kbd.nextDouble();

        System.out.print("Y1 = ");
        y1 = kbd.nextDouble();

        System.out.print("X2 = ");
        x2 = kbd.nextDouble();

        System.out.print("Y2 = ");
        y2 = kbd.nextDouble();

        // Distances calculation
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        // Show the results
        System.out.println("Distances = " + distance);
    }
}