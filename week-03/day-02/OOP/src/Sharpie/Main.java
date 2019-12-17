package Sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie first = new Sharpie("red", 0.5f);
        Sharpie second = new Sharpie("blue", 0.2f);

        first.use();
        second.use();

        first.print();

        second.print();


    }
}
