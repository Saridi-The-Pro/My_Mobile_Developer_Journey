// Presentation of numbers 1 to 5
//    using do...while

import java.util.Scanner;

public class OneToFive {
    public static void main (String[] args) {
        int number;

        number = 1;
        do {
            System.out.println(number);

            number = number + 1;
        } while (number <= 5);
    }
}
