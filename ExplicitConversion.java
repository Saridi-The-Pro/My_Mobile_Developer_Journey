public class ExplicitConversion {
    public static void main(String [] args) {
        float examResults;
        int roundResults;

        examResults = 78.6f;
        roundResults = (int) examResults;

        System.out.println("Round result = " + roundResults);
    }
}