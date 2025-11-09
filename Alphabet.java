// Presentation of letters A to Z
//    using do...while

public class Alphabet {
    public static void main (String[] args) {
        char letter;

        letter = 'A';
        do {
            System.out.println(letter + " ");

            letter = (char) ((int) letter + 1);
        } while (letter <= 'Z');

        System.out.println();
    }
}