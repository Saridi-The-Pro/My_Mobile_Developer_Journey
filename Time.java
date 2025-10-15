public class Time {
    public static void main (String [] args) {
        int hour = 8;
        int minute = 9;
        int second = 2;

        System.out.println(hour + ":" + minute + ":" + second);
        System.out.printf("%2d:%2d:%2d\n", hour, minute, second);
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
}