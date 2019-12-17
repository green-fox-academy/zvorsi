package Animal;

public class main {
    public static void main(String[] args) {

        Animal tigger = new Animal("tigger");
        Animal donkey = new Animal("donkey");
        Animal piglet = new Animal("piglet");

        tigger.print();
        donkey.print();
        piglet.print();

        tigger.eat();
        tigger.play();
        donkey.drink();
        piglet.play();

        tigger.print();
        donkey.print();
        piglet.print();
    }
}
