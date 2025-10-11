import java.util.Scanner;

public class InputAge {
    public static void main(String[] args) {
        int age;

        Scanner kbd = new Scanner(System.in);
        System.out.println("input your age: ");
        age = kbd.nextInt();

        System.out.println("Thank you. " + "Your age next year: " + (age + 1));
    }
}