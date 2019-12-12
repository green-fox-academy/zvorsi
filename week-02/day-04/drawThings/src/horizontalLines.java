import java.awt.*;
import java.util.Random;
import javax.swing .*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class horizontalLines {

    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a 50 long horizontal line from that point.
    // Draw at least 3 lines with that function using a loop.

    public static void mainDraw(Graphics graphics) {

        Random random = new Random();

        for (int i = 0; i < 3 ; i++) {
            int x = random.nextInt(HEIGHT);
            int y = random.nextInt(HEIGHT);
            drawHorizontalLines(graphics, x, y);
        }

    }

    private static void drawHorizontalLines(Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, x + 50, y);
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
