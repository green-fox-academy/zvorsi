package Power;

public class Power {
    public static void main(String[] args) {

        int result = power(2, 3);
        System.out.println(result);

    }

    public static int power(int n, int k) {
        if( k== 0 ){
            return 1;
        }else{
            return (n * power(n,k-1));
        }
    }
}
