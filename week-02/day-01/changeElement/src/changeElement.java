public class changeElement {
    public static void main(String[] args) {

        // - Create an array variable named `s`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // - Print the fourth element

        int[] s = {1, 2, 3, 8, 5, 6};
       /*  for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
            }
            System.out.print("\n");*/
         //Overwrite variable:
        s[3] = 4;
        System.out.print(s[3]);

    }
}
