// Determination of scores A, B, C, D, and E
//    using switches

import java.util.Scanner;

public class Score3 {
    public static void main (String[] args) {
        System.out.println("Determination of subject scores");
        System.out.println("-------------------------------");

        double grade;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Grade (0 until 100) = ");
        grade = kbd.nextDouble();

        // Division by 10
        int number = (int) (grade / 10);

        // Scoring
        if (grade <= 0 || grade > 100)
            System.out.println("Invalid value");
        else
            switch (number) {
                case 10:
                case 9:
                    System.out.println("Score A");
                    break;
                case 8:
                case 7:
                    System.out.println("Score B");
                    break;
                case 6:
                    System.out.println("Score C");
                    break;
                case 5:
                    System.out.println("Score D");
                    break;
                default:
                    System.out.println("Score E");
                    break;
            }
    }
}