// Character type testing
//     Version 2

import java.util.Scanner;

public class Identification2 {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Character type testing");
        System.out.println("----------------------");

        boolean capitalLetter, lowerCase, number;
        char character;

        System.out.print("Character = ");
        character = kbd.findInLine(".").charAt(0);

        capitalLetter = Character.isUpperCase(character);
        lowerCase = Character.isLowerCase(character);
        number = Character.isDigit(character);

        System.out.println("Capital Letter? " + capitalLetter);
        System.out.println("Lower Case? " + lowerCase);
        System.out.println("Number? " + number);
    }
}