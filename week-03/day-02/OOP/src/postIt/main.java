package postIt;

public class main {
    public static void main(String[] args) {
        postIt postIt1 = new postIt("Color.ORANGE", "Idea 1", "Color.BLUE");
        postIt postIt2 = new postIt("Color.PINK", "Awesome!", "Color.BLACK");
        postIt postIt3 = new postIt("Color.YELLOW", "Superb!", "Color.GREEN");

        postIt1.print();
        postIt2.print();
        postIt3.print();
    }

}
