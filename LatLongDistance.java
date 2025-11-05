// The distance between two positions on Earth

import java.util.Scanner;
import java.lang.Math;

public class LatLongDistance {
    public static void main (String[] args) {
        final double RADIAN = 0.017453277; // pi / 180
        final double REARTH = 6371.0;      // KM

        double latitude1, longtitude1, latitude2, longtitude2;

        Scanner kbd = new Scanner(System.in);

        System.out.println("Calculating distances on earth");
        System.out.println("------------------------------");

        System.out.print("Latitude 1 = ");
        latitude1 = kbd.nextDouble();

        System.out.print("Longtitude 1 = ");
        longtitude1 = kbd.nextDouble();

        System.out.print("Latitude 2 = ");
        latitude2 = kbd.nextDouble();

        System.out.print("Longtitude 2 = ");
        longtitude2 = kbd.nextDouble();

        // Convert to radians
        latitude1 *= RADIAN;
        latitude2 *= RADIAN;

        longtitude1 *= RADIAN;
        longtitude2 *= RADIAN;

        // Calculate the distance between two positions
        double distance = REARTH * Math.acos((Math.sin(latitude1) * Math.sin(latitude2)) + (Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longtitude1 - longtitude2)));

        // Show the results
        System.out.println("Distance in KM = " + distance);
    }
}