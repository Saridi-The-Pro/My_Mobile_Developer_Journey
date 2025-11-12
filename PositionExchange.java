// Example of position swapping in an array
//    when displaying the contents of an array

public class PositionExchange {
    public static void main (String[] args) {
        int[] data = {7, 8, 9, 1, 4, 0, 3, 5, 2, 6};

        for (int index = 0; index < data.length / 2; index++) {
            System.out.println(data[index * 2 + 1] + " ");
            System.out.println(data[index * 2] + " ");
        }

        System.out.println();
    }
}