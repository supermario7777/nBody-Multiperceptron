public class Transform2D {
    // Scales the polygon by the factor alpha.
    public static void scale(double[] x, double[] y, double alpha) {
        double[] xScaleCopy = copy(x);
        double[] yScaleCopy = copy(y);
        for (int i = 0; i < x.length; i++) x[i] = xScaleCopy[i] * alpha;
        for (int i = 0; i < y.length; i++) y[i] = yScaleCopy[i] * alpha;

    }

    // Translates the polygon by (dx, dy).
    public static void translate(double[] x, double[] y, double dx, double dy) {
        double[] xTranslateCopy = copy(x);
        double[] yTranslateCopy = copy(y);
        for (int i = 0; i < x.length; i++) x[i] = xTranslateCopy[i] + dx;
        for (int i = 0; i < y.length; i++) y[i] = yTranslateCopy[i] + dy;
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }

    // Returns a new array object that is an exact copy of the given array.
    // The given array is not mutated.
    public static double[] copy(double[] array) {
        double[] arrCopy = new double[array.length];
        for (int i = 0; i < array.length; i++) arrCopy[i] = array[i];
        return arrCopy;
    }

    // Rotates the polygon theta degrees counterclockwise, about the origin.
    public static void rotate(double[] x, double[] y, double theta) {
        double[] xRotateCopy = copy(x);
        double[] yRotateCopy = copy(y);
        double thetaRad = Math.toRadians(theta);
        for (int i = 0; i < xRotateCopy.length; i++) {
            x[i] = xRotateCopy[i] * (Math.cos(thetaRad)) - yRotateCopy[i] * (Math.sin(thetaRad));
            y[i] = yRotateCopy[i] * (Math.cos(thetaRad)) + xRotateCopy[i] * (Math.sin(thetaRad));
        }
    }

    // Tests each of the API methods by directly calling them.
    public static void main(String[] args) {

        // Set the x- and y-scale
        StdDraw.setScale(-5.0, 5.0);
        // Original polygon
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };
        // Copy of original polygon
        double[] cx = Transform2D.copy(x);
        double[] cy = Transform2D.copy(y);

        // Rotate, translate and draw the copy
        Transform2D.rotate(cx, cy, -45.0);
        Transform2D.translate(cx, cy, 1.0, 2.0);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(cx, cy);
        // Draw the original polygon
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);


        // To test scale function
        scale(x, y, 2.0);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.polygon(x, y);

        // To test translate function
        translate(x, y, 2.0, 1.0);
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.polygon(x, y);

        // To test rotate function
        rotate(x, y, 45.0);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.polygon(x, y);


        // Original polygon
        //  double[] x = { 1, 2, 2, 1 };
        //  double[] y = { 1, 1, 3, 2 };
        //  StdDraw.setPenColor(StdDraw.RED);
        //  StdDraw.polygon(x, y);
        // Rotate polygon
        // 90 degrees counterclockwise
        Transform2D.rotate(x, y, 90.0);
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.polygon(x, y);


    }
}
