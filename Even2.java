// Determining even or odd numbers
//     using if-else

import java.util.Scanner;

public class Even2 {
    public static void main(String[] args) {
        System.out.println("Determining even/odd numbers");
        System.out.println("----------------------------");

        int number;
        String category;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Number = ");
        number = kbd.nextInt();

        // Determining even or odd numbers
        category = "odd number";
        if (number % 2 == 0)
            System.out.println("Number " + number + " is an even number");
        else
            System.out.println("Number " + number + " is an odd number");
    }
}