// How to get the name of the day
//    using the Zeller algorithm

import java.util.Scanner;

public class NameDay {
    public static void main (String[] args) {
        int date, month, year;

        System.out.println("determining the name day");
        System.out.println("------------------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("Date (1...31): ");
        date = kbd.nextInt();

        System.out.print("Month (1...12): ");
        month = kbd.nextInt();

        System.out.print("Year: ");
        year = kbd.nextInt();

        // Convert month and year for month 1 or 2
        if (month == 1) {
            month = 13;
            year = year - 1;
        }
        else
            if (month == 2) {
                month = 14;
                year = year - 1;
            }
        
        // Get day code
        int yearInCentury = year % 100;
        int century = year / 100;

        int dayCode = (date + (26*(month + 1) / 10) + yearInCentury + yearInCentury / 4 + century / 4 + 5 * century) % 7;

        System.out.println("Day code = " + dayCode);

        switch (dayCode) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }
    }
}