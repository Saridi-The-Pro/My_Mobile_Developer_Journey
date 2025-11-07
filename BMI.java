// Calculate BMI

import java.util.Scanner;

public class BMI {
    public static void main (String[] args) {
        System.out.println("Body Mass Index");
        System.out.println("---------------");

        double weight, height;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Weight (kg) = ");
        weight = kbd.nextDouble();

        System.out.print("Height (m) = ");
        height = kbd.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Show the results
        System.out.printf("BMI : %.2f\n", bmi);

        if (bmi < 18.5)
            System.out.println("Category: thin");
        else
            if (bmi < 25)
                System.out.println("Category: normal");
            else
                if (bmi < 30)
                    System.out.println("Category: overweight");
                else
                    System.out.println("Category: obese");
            
    }
}