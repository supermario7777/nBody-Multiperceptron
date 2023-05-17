public class FilledCircle {

    public static void NCircle(double x, double y, double radius) {

        if (radius == 0) return;

        int r = StdRandom.uniform(0, 255);
        int g = StdRandom.uniform(0, 255);
        int b = StdRandom.uniform(0, 255);
        StdDraw.setPenColor(r, g, b);
        StdDraw.filledCircle(x, y, radius);
        NCircle(x, y, radius - 0.01);


    }

    public static void main(String[] args) {


        NCircle(0.5, 0.5, 0.5);

    }
}
