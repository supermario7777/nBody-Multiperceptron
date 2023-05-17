public class Sierpinski {
    // Height of an equilateral triangle whose sides are of the specified length.
    public static double height(double length) {
        return length * (Math.sqrt(3) / 2);
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y)
    // of the specified side length.
    public static void filledTriangle(double x, double y, double length) {
        double[] xPointArr = { x, x + (length / 2), x - (length / 2), x };
        double[] yPointArr = { y, y + height(length), y + height(length), y };

        int r = (StdRandom.uniform(0, 256)), g = (StdRandom.uniform(0, 256)), b
                = (StdRandom.uniform(0, 240));
        StdDraw.setPenColor(r, g, b);
        StdDraw.filledPolygon(xPointArr, yPointArr);
    }


    // Draws a Sierpinski triangle of order n, such that the largest filled
    // triangle has bottom vertex (x, y) and sides of the specified length.
    public static void sierpinski(int n, double x, double y, double length) {
        // System.out.println(n);
        // base statement
        if (n == 0) return;
        filledTriangle(x, y, length);
        sierpinski(n - 1, x - length / 2, y, length / 2);
        sierpinski(n - 1, x + length / 2, y, length / 2);
        sierpinski(n - 1, x, y + height(length), length / 2);

    }

    // Takes an integer command-line argument n;
    // draws the outline of an equilateral triangle (pointed upwards) of length 1;
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and
    // draws a Sierpinski triangle of order n that fits snugly inside the outline.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StdDraw.setPenColor((StdRandom.uniform(0, 256)), (StdRandom.uniform(0, 256)),
                            (StdRandom.uniform(0, 240)));
        StdDraw.setPenRadius(0.002);
        StdDraw.line(0, 0, 1, 0);
        StdDraw.line(1, 0, 0.5, Math.sqrt(3) / 2);
        StdDraw.line(0.5, Math.sqrt(3) / 2, 0, 0);
        sierpinski(n, 0.5, 0.0, 0.5);

    }
}


/* Test Inputs:
java-introcs Sierpinski 1
java-introcs Sierpinski 2
java-introcs Sierpinski 3
*/
