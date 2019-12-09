public class doubling {
    public static void main(String[] args) {

        // - Create an integer variable named `baseNum` and assign the value `123` to it
        // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
        // - Print the result of `doubling(baseNum)`

        int baseNum = 123;
        doubling(baseNum);
        int baseNum2 = 76;
        doubling(baseNum2);
        int e = 1;
        doubling(baseNum);
        doubling(6);
    }

    public static int doubling(int n){
        int doubled = n * 2;
        System.out.println(doubled);
        return doubled;

    }
}
