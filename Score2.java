// Determination of scores A, B, C, D, and E
//     using nested if

import java.util.Scanner;

public class Score2 {
    public static void main (String[] args) {
        System.out.println("determination of subject scores");
        System.out.println("-------------------------------");

        double grade;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Score (0 until 100) = ");
        grade = kbd.nextDouble();

        // Scoring
        if (grade <= 0 || grade > 100)
            System.out.println("Invalid grade");
        else
            if (grade >= 90)
                System.out.println("Score A");
            else
                if (grade >= 70)
                    System.out.println("Score B");
                else
                    if (grade >= 60)
                        System.out.println("Score C");
                    else
                        if (grade >= 50)
                            System.out.println("Score D");
                        else
                            System.out.println("Score E");
    }
}