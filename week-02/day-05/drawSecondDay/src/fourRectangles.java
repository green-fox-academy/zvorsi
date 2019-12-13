import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class fourRectangles {

    public static void mainDraw(Graphics graphics) {

        // draw four different size and color rectangles.
        // avoid code duplication.

        Random random = new Random(HEIGHT);


        for (int i = 0; i <= WIDTH/10; i++) {
            int x = random.nextInt(HEIGHT/2);
            int y = random.nextInt(WIDTH/2);
            int b = random.nextInt(255);
            int g = random.nextInt(255);
            int r = random.nextInt(255);
            int alpha = random.nextInt(100);
            Color randomColor = new Color(r, g, b, alpha);
            graphics.setColor(randomColor);
            drawRectangle(graphics, x, y);
        }
    }

    private static void drawRectangle(Graphics graphics, int x, int y) {
        graphics.fillRect(x, y, x, x);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocation(0,0);
        //jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }

    }
}
