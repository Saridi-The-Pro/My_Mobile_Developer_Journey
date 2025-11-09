// Presentation of numbers 5 to 1
//    Using while

public class While5Until1 {
    public static void main (String[] args) {
        int number;

        number = 5;
        while (number >= 1) {
            System.out.println(number);

            number = number - 1;
        }
    }
}