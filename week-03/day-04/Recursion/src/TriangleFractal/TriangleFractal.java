package TriangleFractal;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleFractal {
    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = 160;
        int side = (WIDTH * HEIGHT) / 4;

        drawTriangle(x, side, graphics);
    }

    private static void drawTriangle(int x, int side, Graphics graphics) {
        int y = 160;

        if (side < 1) {
            return;
        }
        graphics.setColor(Color.RED);
        graphics.drawLine(y, x, y/2, y);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(y/2, y, y+y/2, y);
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(y+y/2, y, y, x);

        drawTriangle(y/4*3, side /2 , graphics);
        //drawTriangle();
        //drawTriangle();
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
        jFrame.setLocation(0, 0);
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

