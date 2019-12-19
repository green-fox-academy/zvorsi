package NumberAdder;

public class NumberAdder {
    public static void main(String[] args) {

        System.out.println("sum " + numberAdder(3));

    }

    private static int numberAdder(int n) {
        if (n == 1){
            return 1;
        }
        //System.out.println(n);
        return n + numberAdder(n -1);
        //System.out.println(n);
    }
}
