import java.util.ArrayList;
import java.util.HashMap;

public class fiveTrees {
    public static void main(String[] args) {

//        Create 5 trees
//        Store the data of them in variables in your program
//        for every tree the program should store its'
//        type
//        leaf color
//        age
//        sex

/*
        HashMap<Integer, HashMap<String, String>> Tree = new HashMap<Integer, HashMap<String, String>>();
        HashMap<String, String> Tree1 = new HashMap<>();
        HashMap<String, String> Tree2 = new HashMap<>();
        HashMap<String, String> Tree3 = new HashMap<>();
        HashMap<String, String> Tree4 = new HashMap<>();
        HashMap<String, String> Tree5 = new HashMap<>();

        Tree1.put("type", "");
        Tree1.put("leaf color", "");
        Tree1.put("age", "");
        Tree1.put("sex", "");


        Tree.put(1, Tree1);
        Tree.put(2, Tree2);
        Tree.put(3, Tree3);
        Tree.put(4, Tree4);
        Tree.put(5, Tree5);
*/

        HashMap<Integer, String> TreeA = new HashMap<>();
        TreeA.put(1, "type");
        TreeA.put(2, "leaf color");
        TreeA.put(3, "age");
        TreeA.put(4, "sex");

        HashMap<Integer, String> TreeB = new HashMap<>();
        TreeB.put(1, "type");
        TreeB.put(2, "leaf color");
        TreeB.put(3, "age");
        TreeB.put(4, "sex");

        HashMap<Integer, String> TreeC = new HashMap<>();
        TreeC.put(1, "type");
        TreeC.put(2, "leaf color");
        TreeC.put(3, "age");
        TreeC.put(4, "sex");

        HashMap<Integer, String> TreeD = new HashMap<>();
        TreeD.put(1, "type");
        TreeD.put(2, "leaf color");
        TreeD.put(3, "age");
        TreeD.put(4, "sex");

        HashMap<Integer, String> TreeE = new HashMap<>();
        TreeE.put(1, "type");
        TreeE.put(2, "leaf color");
        TreeE.put(3, "age");
        TreeE.put(4, "sex");

        System.out.println(TreeA);
        System.out.println(TreeB);
        System.out.println(TreeC);
        System.out.println(TreeD);
        System.out.println(TreeE);

    }
}
