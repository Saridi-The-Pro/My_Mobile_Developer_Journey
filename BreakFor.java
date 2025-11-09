// Example to show the effect of break
//    on for

public class BreakFor {
    public static void main (String[] args) {
        for (int number = 1; number <= 8; number++) {
            if (number == 5)
                break;
            
            System.out.println(number);
        }
    }
}