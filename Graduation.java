// Determining whether to pass or not

import java.util.Scanner;

public class Graduation {
    public static void main (String[] args) {
        int grade;
        Scanner kbd = new Scanner(System.in);

        System.out.println("Determining whether to pass or not");
        System.out.print("Grade = ");
        grade = kbd.nextInt();

        boolean pass = grade >= 60;
        String result = pass ? "Pass": "Not pass";
        System.out.println(result);
    }
}