import java.util.Scanner;
import java.lang.Math;

public class TowerHeight {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);

        double x, degrees;

        System.out.print("x = ");
        x = kbd.nextDouble();

        System.out.print("Angle (in degrees) = ");
        degrees = kbd.nextDouble();

        double radians = Math.toRadians(degrees);
        double y = x * Math.toRadians(radians);

        System.out.printf("Tower height = %.2f\n", y);
    }
}
