public class ShortCircuit {
    public static void main (String[] args) {
        System.out.println("Short circuit effect");
        System.out.println("--------------------");

        int x = 5, y = 0;
        boolean logic;

        logic = (x == 4) && (++y == 1);
        System.out.println("Logic = " + logic);
        System.out.println("y     = " + y);

        System.out.println();

        logic = (x == 5) && (++y == 1);
        System.out.println("Logic = " + logic);
        System.out.println("y     = " + y);
    }
}