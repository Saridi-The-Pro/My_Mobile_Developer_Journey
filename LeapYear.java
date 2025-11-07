// Leap year determination

import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args) {
        System.out.println("Leap year determination");
        System.out.println("-----------------------");

        int year;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Year = ");
        year = kbd.nextInt();

        if (year % 4 == 0)
            if (year % 100 == 0 && year % 400 != 0)
                System.out.println("Not a leap year");
            else
                System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}