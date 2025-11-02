// Installment calculation

import java.util.Scanner;
import java.lang.Math;

public class InstallmentPayment {
    public static void main (String[] args) {
        double principal, interestPerYear;
        int tempoInMonths;

        Scanner kbd = new Scanner(System.in);

        System.out.println("Flat installment model");
        System.out.println("----------------------");

        System.out.print("Principal loan        = ");
        principal = kbd.nextDouble();

        System.out.print("Interest per year (%) = ");
        interestPerYear = kbd.nextDouble();

        System.out.print("Tempo in months       = ");
        tempoInMonths = kbd.nextInt();

        // Installment calculation
        long installment = Math.round(principal * (1.0 / tempoInMonths + interestPerYear / 1200));

        // Show the results
        System.out.println("Monthly installments = " + installment);
    }
}