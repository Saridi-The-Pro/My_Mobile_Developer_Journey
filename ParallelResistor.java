import java.util.Scanner;

public class ParallelResistor {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);

        int r, r1, r2, r3;

        System.out.println("R1 = ");
        r1 = kbd.nextInt();

        System.out.println("R2: ");
        r2 = kbd.nextInt();

        System.out.println("R3: ");
        r3 = kbd.nextInt();

        r = (int) (1 / ( 1.0 / r1 + 1.0 / r2 + 1.0 / r3));

        System.out.println("R = " + r);
    }
}