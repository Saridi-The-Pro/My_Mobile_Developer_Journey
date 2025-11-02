// Operator use !

public class OperatorNot {
    public static void main (String[] args)
    {
        System.out.println("Operator !");
        System.out.println("----------");

        boolean condition = false;

        System.out.println("Initial condition value = " + condition);

        condition = !condition;
        System.out.println("Condition value through " + "!condition = " + condition);

        condition = !condition;
        System.out.println("Condition value through " + "!condition = " + condition);
    }
}