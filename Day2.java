// Determining the name of the day
//     using switches

import java.util.Scanner;

public class Day2 {
    public static void main (String[] args) {
        System.out.println("Determining the name of the day");
        System.out.println("  0 = Sunday       1 = Monday");
        System.out.println("  2 = Tuesday      3 = Wednesday");
        System.out.println("  4 = Thursday     5 = Friday");
        System.out.println("  6 = Saturday");

        System.out.println("--------------------------------");

        int dayCode;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Day code = ");
        dayCode = kbd.nextInt();

        // Determining the name of the day
        String info;

        switch (dayCode) {
            case 0:
                info = "Sunday";
                break;
            case 1:
                info = "Monday";
                break;
            case 2:
                info = "Tuesday";
                break;
            case 3:
                info = "Wednesday";
                break;
            case 4:
                info = "Thursday";
                break;
            case 5:
                info = "Friday";
                break;
            case 6:
                info = "Saturday";
                break;
            default:
                info = "Wrong code";
        }

        System.out.println(info);
    }
}