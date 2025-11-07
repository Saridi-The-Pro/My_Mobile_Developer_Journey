// Determining character type

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        System.out.println("Determining character type");
        System.out.println("--------------------------");

        char ch;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Character = ");
        ch = kbd.findInLine(".").charAt(0);

        // Determine the character type
        if (Character.isUpperCase(ch))
            System.out.println(ch + " is an uppercase letter");
        else
            if (Character.isLowerCase(ch))
                System.out.println(ch + " is a lowercase letter");
            else
                if (Character.isDigit(ch))
                    System.out.println(ch + " is a digit");
                else
                    System.out.println(ch + " is not a letter " + "or a digit");
    }
}