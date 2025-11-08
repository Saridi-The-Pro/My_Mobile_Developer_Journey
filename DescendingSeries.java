// Presentation of numbers 5 to 1
//    using do...while

public class DescendingSeries {
    public static void main (String[] args) {
        int number;

        number = 5;
        do {
            System.out.println(number);
            number = number - 1;
        } while (number >= 1);
    }
}