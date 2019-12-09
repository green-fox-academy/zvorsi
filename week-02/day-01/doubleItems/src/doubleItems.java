public class doubleItems {
    public static void main(String[] args) {

        // - Create an array variable named `numList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array

        int[] numList = {3, 4, 5, 6, 7};
        for (int item : numList) {
            System.out.print(item + " ");
            }
        System.out.println();
         for (int item : numList){
             System.out.print(item * 2 + " ");
            }
    }

    }


