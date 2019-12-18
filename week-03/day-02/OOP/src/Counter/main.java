package Counter;

public class main {
    public static void main(String[] args) {

        Counter counter1 = new Counter("1",0);
        Counter counter2 = new Counter("apple", 2);
        counter1.print();
        counter2.print();

        counter1.add(2);
        counter1.print();
        counter1.reset();
        counter1.print();
        counter1.add();
        counter2.add(7);
        counter1.print();
        counter2.print();
        counter2.reset();
        counter2.print();
    }
}
