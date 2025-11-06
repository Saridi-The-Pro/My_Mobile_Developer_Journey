// Determination of scores A, B, C, D, and E

import java.util.Scanner;

public class Score {
    public static void main (String[] args) {
        System.out.println("Determination of subject scores");
        System.out.println("-------------------------------");

        double grade;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Grade (0 until 100) = ");
        grade = kbd.nextDouble();

        // Scoring
        if (grade >= 90)
            System.out.println("Score A");

        if (grade >= 70 && grade < 90)
            System.out.println("Score B");

        if (grade >= 60 && grade < 70)
            System.out.println("Score C");
        
        if (grade >= 50 && grade < 60)
            System.out.println("Score D");
        
        if (grade < 50)
            System.out.println("Score E");
    }
}