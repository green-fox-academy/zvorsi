import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class positionSquare {

    public static void mainDraw(Graphics graphics) {

        // create a function that draws one square and takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication

        Random random = new Random();
        for (int i = 3; i > 0; i--) {
            int x = random.nextInt(HEIGHT-50);
            int y = random.nextInt(WIDTH)-50;
            drawsquare(graphics, x, y);
        }
    }

    private static void drawsquare(Graphics graphics, int x, int y) {
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x, y, 50, 50);
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
