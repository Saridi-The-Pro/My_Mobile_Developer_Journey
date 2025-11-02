// Character type testing

import java.util.Scanner;

public class Identification {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Character type testing");
        System.out.println("----------------------");

        boolean capitalLetter, lowerCase, number;
        char character;

        System.out.print("Character = ");
        character = kbd.findInLine(".").charAt(0);

        capitalLetter= character >=  'A' && character <= 'Z';
        lowerCase = character >= 'a' && character <= 'z';
        number = character >= 0 && character <= '9';

        System.out.println("Capital Letter? " + capitalLetter);
        System.out.println("Lower Case? " + lowerCase);
        System.out.println("Number? " + number);
    }
}