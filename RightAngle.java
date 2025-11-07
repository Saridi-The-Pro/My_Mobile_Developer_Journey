// Determining whether a triangle is a right angle or not

import java.util.Scanner;

public class RightAngle {
    public static void main (String[] args) {
        System.out.println("Determining whether a triangle is a right angle or not");
        System.out.println("------------------------------------------------------");

        double a, b, c;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter the three values ​​of the sides of the triangle: ");
        a = kbd.nextDouble();
        b = kbd.nextDouble();
        c = kbd.nextDouble();

        boolean rightTriangle = false;
        double toleranceValue = 0.00001;

        double sumOfSquares = a * a + b * b;
        double cSquare = c * c;

        // Determining whether a triangle is a right angle or not
        if (sumOfSquares >= cSquare - toleranceValue && sumOfSquares <= cSquare + toleranceValue)
            rightTriangle = true;
        else {
            sumOfSquares = a * a + c * c;
            double bSquare = b * b;
            if (sumOfSquares >= bSquare - toleranceValue && sumOfSquares <= bSquare + toleranceValue)
                rightTriangle = true;
            else {
                sumOfSquares = b * b + c * c;
                double aSquare = a * a;
                if (sumOfSquares >= aSquare - toleranceValue && sumOfSquares  <= aSquare + toleranceValue)
                    rightTriangle = true;
            }
        }

        // Show the results
        if (rightTriangle)
            System.out.println("Right triangle");
        else
            System.out.println("Not a right triangle");
    }
}