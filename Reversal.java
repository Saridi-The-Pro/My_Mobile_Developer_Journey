// Example of reverse array presentation

public class Reversal {
    public static void main (String[] args) {
        int[] data = {7, 8, 9, 1, 4, 0, 3, 5, 2, 6};

        int numOfData = data.length;
        for (int index = 0; index < numOfData; index++)
            System.out.print(data[numOfData - index - 1] + " ");
        
        System.out.println();
    }
}