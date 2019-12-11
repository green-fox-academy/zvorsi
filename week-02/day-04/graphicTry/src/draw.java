import javax.swing.*;

public class draw {
    public static void main(String[] args) {

        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphicTry graphicTry = new graphicTry();
        f.add(graphicTry);
        f.setSize(400,250);
        f.setVisible(true);

    }
}
