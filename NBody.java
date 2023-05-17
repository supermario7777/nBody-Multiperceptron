public class NBody {
    public static void main(String[] args) {

        double stoppingTime = Double.parseDouble(args[0]);
        double tau = Double.parseDouble(args[1]);
        double G = 6.67e-11;

        int n = StdIn.readInt();
        double radius = StdIn.readDouble();

        StdDraw.setXscale(-radius, radius);
        StdDraw.setYscale(-radius, radius);
        StdDraw.enableDoubleBuffering();

        double[] px = new double[n];
        double[] py = new double[n];
        double[] vx = new double[n];
        double[] vy = new double[n];
        double[] mass = new double[n];
        String[] image = new String[n];


        for (int i = 0; i < n; i++) {

            px[i] = StdIn.readDouble();
            py[i] = StdIn.readDouble();
            vx[i] = StdIn.readDouble();
            vy[i] = StdIn.readDouble();
            mass[i] = StdIn.readDouble();
            image[i] = StdIn.readString();

        }

        for (double t = 0; t < stoppingTime; t = t + tau) {
            // System.out.println("t = " + t);

            for (int i = 0; i < n; i++) {
                double[] Fx = new double[n];
                double[] Fy = new double[n];
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        double dx = px[j] - px[i];
                        double dy = py[j] - py[i];
                        double r = Math.pow((dx * dx + dy * dy), 0.5);
                        double F = (G * mass[i] * mass[j]) / Math.pow(r, 2);
                        Fx[i] = Fx[i] + F * dx / r;
                        Fy[i] = Fy[i] + F * dy / r;
                    }
                }

                double ax = Fx[i] / mass[i];
                double ay = Fy[i] / mass[i];

                vx[i] = vx[i] + ax * tau;
                vy[i] = vy[i] + ay * tau;

                px[i] = px[i] + vx[i] * tau;
                py[i] = py[i] + vy[i] * tau;

                StdDraw.show();
                StdDraw.pause(1 / 10);
            }

            StdDraw.picture(0.0, 0.0, "starfield.jpg");
            

            for (int i = 0; i < n; i++) {
                StdDraw.picture(px[i], py[i], image[i]);
            }
        }

        /* StdOut.printf("%d\n", n);
        StdOut.printf("%.2e\n", radius);
        for (int i = 0; i < n; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                          px[i], py[i], vx[i], vy[i], mass[i], image[i]);
        } */
        StdAudio.play("2001.wav");
    }
}
