// Determining the largest number
//     between two numbers

import java.util.Scanner;

public class Biggest {
    public static void main (String[] args) {
        System.out.println("Largest number");
        System.out.println("between two integers");
        System.out.println("--------------------");

        int numberx, numbery, biggest;

        Scanner kbd = new Scanner(System.in);

        System.out.print("First number = ");
        numberx = kbd.nextInt();

        System.out.print("Second number = ");
        numbery = kbd.nextInt();

        // Determining the largest number
        biggest = numberx;
        if (numbery > biggest)
            biggest = numbery;
        
        // Show the results
        System.out.println("Biggest number = " + biggest);
    }
}