//  Searching for data in
// an array

import java.util.Scanner;

public class DataSearch {
    public static void main(String[] args) {
        int[] data = {
            77, 48, 2, 23, 33, 45, 56, 0, 86, 71
        };

        int search;
        System.out.println("Data Search");
        System.out.println("===========");
        System.out.print("The data sought: ");
        Scanner kbd = new Scanner(System.in);
        search = kbd.nextInt();

        // Data search
        int position = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == search) {
                position = index;
                break;
            }
        }
        // Presentation of information
        if (position == -1)
            System.out.println("Data not found");
        else
            System.out.println("Data found. Position on index " + position);
    }
}