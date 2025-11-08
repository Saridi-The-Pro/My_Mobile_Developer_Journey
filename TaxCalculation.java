// Tax calculation

import java.util.Scanner;

public class TaxCalculation {
    public static void main (String[] args) {
        System.out.println("Tax calculation");
        System.out.println("---------------");
        
        long income, tax;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Taxable income = ");
        income = kbd.nextLong();

        // Determine taxes
        if (income > 500000000)
            tax = 2500000 + 15000000 + 87500000 + (income - 500000000) * 30 / 100;
            else
                if (income > 150000000)
                    tax = 2500000 + 15000000 + (income - 150000000) * 25 / 100;
                else
                    if (income > 50000000)
                        tax = 2500000 + (income - 50000000) * 15 / 100;
                    else
                        tax = income * 5 / 100;
        
        // Show the results
        System.out.println("Tax = " + tax);
    }
}