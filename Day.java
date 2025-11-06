// Determining the name of the day

import java.util.Scanner;

public class Day {
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

        if (dayCode == 0)
            info = "Sunday";
        else
            if (dayCode == 1)
                info = "Monday";
            else
                if (dayCode == 2)
                    info = "Tuesday";
                else
                    if (dayCode == 3)
                        info = "Wednesday";
                    else
                        if (dayCode == 4)
                            info = "Thursday";
                        else
                            if (dayCode == 5)
                                info = "Friday";
                            else
                                if (dayCode == 6)
                                    info = "Saturday";
                                else
                                    info = "Incorrect code";
        
        System.out.println(info);
    }
}