public class FractalTriangle {

    public static double radLower(int n, double radius) {
        for (int i = 0; i <= n; i++) {
            radius -= 0.2;
        }
        return radius;
    }


    public static void drawCircle(int n, double x, double y, double radius) {

        for (int i = 0; i <= n; i++) {

            double x1 = StdRandom.uniform(0, x);
            double y1 = StdRandom.uniform(0, y);
            // generate random RGB values
            int r = StdRandom.uniform(0, 255), g = StdRandom.uniform(0, 255), b = StdRandom.uniform(
                    0,
                    255);
            // set generated pen color
            StdDraw.setPenColor(r, g, b);
            StdDraw.filledCircle(x1, y1, radius);
        }

    }

    public static void draw(int n, double x, double y, double radius) {
        // base case
        if (radius == 0) return;

        // inductive step
        drawCircle(n - 1, x, y, radius);
        draw(n - 1, x, y, radius - 0.2);


    }


    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        StdDraw.setScale(-5, +5);

        double radius = StdRandom.uniform(0, 0.5);
        double x = StdRandom.uniform(0, 1);
        double y = StdRandom.uniform(0, 1);
        draw(n, x, y, radius);


    }
}


