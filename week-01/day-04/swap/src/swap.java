public class swap {
    public static void main(String[] args) {

        // Swap the values of the variables
        int a = 123;
        int b = 526;

        System.out.println(a);
        System.out.println(b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        // other solution from howotodoinjava.com
        int x = 100;
        int y = 200;
        System.out.println("x original: " + x);
        System.out.println("y original: " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x + " and y = " + y);
    }
}
