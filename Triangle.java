// Calculating the area of ​​a triangle

import java.util.Scanner;
import java.lang.Math;

public class Triangle {
    public static void main (String[] args) {
        double a, b, c;

        Scanner kbd = new Scanner(System.in);

        System.out.println("Calculating the area of ​​a triangle");
        System.out.println("----------------------------------");

        System.out.print("First side = ");
        a = kbd.nextDouble();

        System.out.print("Second side = ");
        b = kbd.nextDouble();

        System.out.print("Third side = ");
        c = kbd.nextDouble();

        // Calculating the area of ​​a triangle
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Show the results
        System.out.println("Area = " + area);
    }
}