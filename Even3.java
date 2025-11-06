// Determining even or odd numbers
//     using the ?: operator

import java.util.Scanner;

public class Even3 {
    public static void main (String[] args) {
        System.out.println("Determining even/odd numbers");
        System.out.println("----------------------------");

        String category;
        int number;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Number = ");
        number = kbd.nextInt();

        // Determining even or odd numbers
        category = number % 2 == 0 ? "even number" : "odd number";

        System.out.println("Number " + number + " is " + category);
    }
}