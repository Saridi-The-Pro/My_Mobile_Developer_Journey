// Discount determination

import java.util.Scanner;

public class Discount {
    public static void main (String[] args) {
        System.out.println("Discount determination");
        System.out.println("----------------------");

        long amountPurchase, amountPayment, discount;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Nominal purchase amount = ");
        amountPurchase = kbd.nextLong();

        // Discount determination
        discount = 0;
        if (amountPurchase >= 200000)
            discount = (long) (0.05 * amountPurchase);
        
        amountPayment = amountPurchase - discount;

        // Show the results
        System.out.println();
        System.out.println("Purchase = " + amountPurchase);
        System.out.println("Discount = " + discount);
        System.out.println("Payment = " + amountPayment);
    }
}