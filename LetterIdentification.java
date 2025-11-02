// Determining whether a letter is written or not

import java.util.Scanner;

public class LetterIdentification {
    public static void main (String[] main) {
        char cha;
        Scanner kbd = new Scanner(System.in);

        System.out.println("Determining whether a letter is written or not");
        System.out.print("Character = ");
        cha = kbd.findInLine(".").charAt(0);

        boolean character = ((cha >= 'A' && cha <= 'A') || (cha >= 'a' && cha <= 'z'));
        String detail = character ? "character": "not a character";
        System.out.println(cha + " adalah " + detail);
    }
}