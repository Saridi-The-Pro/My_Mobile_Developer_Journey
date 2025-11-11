// Index effects

public class IndexEffects {
    public static void main (String[] args) {
        // Initialization of a one-dimensional array

        int[] data = {50, 77, 30, 1, 22};

        System.out.println("After the array is initialized");

        // Incorrectly indexed modifier
        data [5] = 61;

        System.out.println("*****");
    }
}