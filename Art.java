public class Art {

    public static void drawPolygon(int N, double x, double y, double m, double n) {

        // draw one polygon
        double[] xPointArr = { x, x + n, x, x - n };
        double[] yPointArr = { y + m, y, y - m, y };
        int r = (StdRandom.uniform(0, 256)), g = (StdRandom.uniform(0, 256)), b
                = (StdRandom.uniform(0, 256));
        StdDraw.setPenColor(r, g, b);
        StdDraw.setPenRadius(0.01);
        StdDraw.polygon(xPointArr, yPointArr);

        // base case
        if (N == 0) return;

        // if N > 0, then draw 4 polygons
        drawPolygon(N - 1, x, y + m / 2, m / 2, n / 2);
        drawPolygon(N - 1, x + n / 2, y, m / 2, n / 2);
        drawPolygon(N - 1, x, y - m / 2, m / 2, n / 2);
        drawPolygon(N - 1, x - n / 2, y, m / 2, n / 2);
    }


    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        double x = 0.5;
        double y = 0.5;
        double m = 0.5;
        double n = 0.5;

        drawPolygon(N, x, y, m, n);

    }
}
