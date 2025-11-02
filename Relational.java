public class Relational {
    public static void main (String[] args) {
        System.out.println("Relational testing");
        System.out.println("------------------");

        int a = 25, b = 23;

        System.out.println(a + " > " + b + "? "  + (a > b));
        
        System.out.println(a + " == " + (b + 2) + "? " + (a == b + 2));

        System.out.println(a + " != " + b + "? " + (a != b));

        System.out.println(a + " <= " + b + "? " + (a <= b));
    }
}