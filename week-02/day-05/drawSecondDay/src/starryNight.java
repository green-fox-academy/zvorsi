import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class starryNight {
    public static void mainDraw(Graphics graphics) {

        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        Random random = new Random();

        for (int i = 0; i < HEIGHT; i++) {
            int x = random.nextInt(HEIGHT);
            int y = random.nextInt(WIDTH);
            int c = random.nextInt(255);
            int d = random.nextInt(255);
            int e = random.nextInt(255);
            int a = random.nextInt(255);
            graphics.setColor(new Color(c, c, c, a));
            graphics.fill3DRect(x, y, 5, 5, true);
        }

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
        jFrame.setLocation(0, 0);
        //jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
/*
            Random random = new Random();
            int r = random.nextInt(250);
            int g = random.nextInt(250);
            int b = random.nextInt(250);
            this.setBackground(Color.getHSBColor(r, g, b));
*/
            this.setBackground(Color.BLACK);
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
