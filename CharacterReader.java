import java.util.Scanner;

public class CharacterReader {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a word > 5 letters: ");
        char charOne = kbd.findInLine(".").charAt(0);
        char charTwo = kbd.findInLine(".").charAt(0);
        String remain = kbd.next();

        System.out.println("charOne = " + charOne);
        System.out.println("charTwo = " + charTwo);
        System.out.println("Remain = " + remain);
    }
}