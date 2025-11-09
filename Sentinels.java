// Use of sentinels for
//   end data entry

import java.util.Scanner;

public class Sentinels {
    public static void main (String[] args) {
        int whole;
        float total, data;

        whole = 0;
        total = 0;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter data. (-1 = done): ");
        data = kbd.nextFloat();

        while (data != -1) {
            whole++;       // Increase by 1
            total += data; // Add data to total

            System.out.print("Enter data. (-1 = done): ");
            data = kbd.nextFloat();
        }

        // Calculate the average
        float average = total / whole;

        System.out.println("Average = " + average);
    }
}