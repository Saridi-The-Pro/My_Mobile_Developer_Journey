import java.util.Scanner;

public class ThreeData {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Input 3 round number: ");
        double varOne = kbd.nextDouble();
        double varTwo = kbd.nextDouble();
        double varThree = kbd.nextDouble();
        
        System.out.println("varOne = " + varOne);
        System.out.println("varTwo = " + varTwo);
        System.out.println("varThree = " + varThree);
    }
}