import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {

//        for (int i = 0; i < HEIGHT; i++) {
        int x = 0;
        int y = 0;

        graphics.setColor(Color.GREEN);
        graphics.drawLine(x, y, HEIGHT, WIDTH);

        if (x == 0 && y == 0) {
            graphics.setColor(Color.RED);
        }
        graphics.drawLine(WIDTH, x, y, HEIGHT);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
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
