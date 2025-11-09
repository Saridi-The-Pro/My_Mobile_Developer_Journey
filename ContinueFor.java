// Example to show the effect of continue
//    on for

public class ContinueFor {
    public static void main (String[] args) {
        for (int number = 1; number <= 8; number++) {
            if (number == 5) {
                System.out.println("continue");
                continue;
            }
        
        System.out.println(number);
        }
    }
}