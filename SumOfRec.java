public class SumOfRec {

    public static int sum(int n) {

        if (n == 0) return 0;
        return n + sum(n - 1);
    }


    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        StdOut.println(sum(n));

    }
}
