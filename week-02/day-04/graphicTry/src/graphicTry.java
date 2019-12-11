import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class graphicTry extends JPanel {
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(new Color(20, 10, 250));
        g.fillOval(25, 25, 100, 100);

        g.setColor(new Color(250, 160, 100));
        g.fillOval(50, 50, 50, 50);

        g.setColor(Color.RED);
        g.drawString("your favorite colors", 25,140);
    }
}
