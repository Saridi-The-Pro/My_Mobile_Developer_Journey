// Determining even or odd numbers

import java.util.Scanner;

public class Even {
    public static void main (String[] args) {
        System.out.println("Determining even/odd numbers");
        System.out.println("----------------------------");

        int number;
        String category;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Odd number = ");
        number = kbd.nextInt();

        // Determining even or odd numbers
        category = "Odd number";
        if (number % 2 == 0)
            category = "Even number";
        
        // Show the results
        System.out.println("Number " + number + " is " + category);
    }
}