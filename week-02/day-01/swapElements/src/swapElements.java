public class swapElements {
    public static void main(String[] args) {
// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

        String[] abc = {"first", "second", "third"};

        for (int i = abc.length - 1; i >= 0; i--) {
            System.out.println(abc[i]);
        }
    }
}
