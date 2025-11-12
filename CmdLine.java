// Example of command line handling

public class CmdLine {
    public static void main (String[] args) {
        for (int j = 0; j < args.length; j++)
            System.out.println(j + ": " + args[j]);
    }
}