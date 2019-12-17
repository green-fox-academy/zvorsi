package Animal;

public class main {
    public static void main(String[] args) {

        Animal tigger = new Animal("tigger", 50, 50);
        Animal donkey = new Animal("donkey", 50, 50);
        Animal piglet = new Animal("piglet", 50, 50);

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
