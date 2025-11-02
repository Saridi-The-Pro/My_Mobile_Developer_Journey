// Testing numbers as even or odd
//      Expressed with logical values

import java.util.Scanner;

public class OddTest {
    public static void main (String [] args) {
        int number;
        Scanner kbd = new Scanner(System.in);

        System.out.println("Determine whether a number is odd or not");
        System.out.print("Integers = ");
        number = kbd.nextInt();

        boolean odd = number % 2 == 1;
        System.out.println("Odd? " + odd);
    }
}