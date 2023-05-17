public class Diamond {

    public static void DrawDiamond(double x, double y, double radius) {
        double[] px = { x + radius, x, x - radius, x };
        double[] py = { y, y + radius, y, y - radius };
        StdDraw.filledPolygon(px, py);
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                StdDraw.setPenRadius();
                StdDraw.setPenColor(StdDraw.BLACK);
                DrawDiamond(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
