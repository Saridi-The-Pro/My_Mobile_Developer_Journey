import java.util.Scanner;

public class EnterAge {
    public static void main (String[] args){
        int age;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = kbd.nextInt();

        System.out.println("Thank You. " + "Your age next year: " + (age + 1));
    }
}