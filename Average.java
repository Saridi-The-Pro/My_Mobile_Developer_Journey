// Average value of 10 data

import java.util.Scanner;

public class Average {
    public static void main (String[] args) {
        int[] data = new int[10];

        int numOfData = data.length;
        System.out.println("Enter " + numOfData + " integer data");

        Scanner kbd = new Scanner(System.in);
        int total = 0;
        for (int index = 0; index < numOfData; index++) {
            data[index] = kbd.nextInt();
            total += data[index];
        }

        float average = total / (float) numOfData;
        System.out.println("Average = " + average);

        // Show all values ​​above average
        System.out.println();
        System.out.println("List of above average values");

        for (int index = 0; index < numOfData; index++)
            if (data[index] > average)
                System.out.println(data[index]);
    }
}