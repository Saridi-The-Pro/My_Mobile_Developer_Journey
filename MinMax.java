// How to get the smallest and largest numbers
//    of a number

import java.util.Scanner;

public class MinMax {
    public static void main (String[] args) {
        System.out.println("Smallest and largest numbers");
        System.out.println("============================");
        
        float number;

        Scanner kbd = new Scanner(System.in);
        System.out.print("number (0 to end) = ");
        number = kbd.nextInt();

        float smallest = 0, largest = 0;

        boolean first = true;
        while (number != 0) {
            if (first) {
                first = false;
                smallest = number;
                largest = number;
            }
            else {
                if (smallest > number)
                    smallest = number;
            
                if (largest < number)
                    largest = number;
            }

            System.out.print("Number = ");
            number = kbd.nextFloat();
        }

        if (first)
            System.out.println("Data not found");
        else {
            System.out.println();
            System.out.println("Smallest = " + smallest);
            System.out.println("Largest = " + largest);
        }
    }
}