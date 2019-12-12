import sun.java2d.loops.DrawLine;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class toTheCenter {
    public static void mainDraw(Graphics graphics) {

        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        Random random = new Random();
        int lineNumber = 10;
        for (int i = 0; i < lineNumber; i++) {
            int x = random.nextInt(HEIGHT);
            int y = random.nextInt(HEIGHT);
            drawALine(graphics, x, y);
        }

    /*    Random random = new Random();
        for (int i = 0; i < lineNumber; i++) {
            int x = random.nextInt(HEIGHT);
            int y = random.nextInt(HEIGHT);
            graphics.drawLine(HEIGHT / 2, WIDTH / 2, x, y);
        }
    */    }

    private static void drawALine(Graphics graphics, int x, int y) {
        graphics.drawLine(HEIGHT / 2, WIDTH / 2, x, y);
    }


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

