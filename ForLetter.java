// Presentation of letters A to Z
//    using for

import java.util.Scanner;

public class ForLetter {
    public static void main (String[] args) {
        for (char letter = 'A'; letter <= 'Z'; letter++)
            System.out.print(letter + " ");
        
        System.out.println(); // Move line
    }
}