import java.awt.Color;

public class Grayscale {
    public static void main(String[] args) {

        Picture drawing = new Picture("tiger.jpg");
        int width = drawing.width();
        int height = drawing.height();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Color curColor = drawing.get(j, i);
                Color mod = Luminance.toGray(curColor);
                drawing.set(j, i, mod);
            }
        }
        drawing.save("newtiger.jpg");
    }
}
