public class Nint {

    public static int round(double a) {

        int b = (int) a;
        double mod = a - b;

        if (mod >= 0.5) {
            return b + 1;
        }
        else {
            return b;
        }
    }


    public static void main(String[] args) {

        double n = Double.parseDouble(args[0]);

        StdOut.println(round(n));

    }
}
