import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class toTheCenter {
    public static void mainDraw(Graphics graphics) {

        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        Random random = new Random();
        int lineNumber = random.nextInt(HEIGHT * 10);


        for (int i = 0; i < lineNumber; i++) {
            int r = random.nextInt(250);
            int g = random.nextInt(250);
            int b = random.nextInt(250);
            Color randomColor = new Color(r, g, b);
            graphics.setColor(randomColor);
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            drawALine(graphics, x, y);
        }
    }

    private static void drawALine(Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
    }



    static int WIDTH = 800;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocation(0,0);
//        jFrame.setLocationRelativeTo(null);
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

