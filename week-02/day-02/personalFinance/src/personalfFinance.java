import java.util.ArrayList;
import java.util.Collections;

public class personalfFinance {
    public static void main(String[] args) {

        ArrayList<Integer> myFinance =new ArrayList<>();
        myFinance.add(500);
        myFinance.add(1000);
        myFinance.add(1250);
        myFinance.add(175);
        myFinance.add(800);
        myFinance.add(120);

        System.out.println("items of my finance" + myFinance);

//      Create an application which solves the following problems.
//      How much did we spend?

        int sum = 0;
        for(int i = 0; i < myFinance.size(); i++){
            sum+=myFinance.get(i);}
        System.out.println("I have spent so far: " + sum);

//      Which was our greatest expense?

//        Integer j = Collections.max(myFinance);
        System.out.println("the largest amount is: " + Collections.max(myFinance));

//      Which was our cheapest spending?

//        Integer k = Collections.min(myFinance);
        System.out.println("the smallest amount is: " + Collections.min(myFinance));

//      What was the average amount of our spendings?
        System.out.println("the average of my expenditures is: " + sum / myFinance.size());
    }
}
