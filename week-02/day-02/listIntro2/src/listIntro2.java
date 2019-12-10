import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class listIntro2 {
    public static void main(String[] args) {

        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        //  System.out.println(ListA);

        ArrayList<String> ListB = new ArrayList<>();
        ListB.add("Apple");
        ListB.add("Avocado");
        ListB.add("Blueberries");
        ListB.add("Durian");
        ListB.add("Lychee");

        if (ListA.contains("Durian")) {
            System.out.println("ListA has durian");
        }

        ListB.remove("Durian");

        ListA.add(4, "Kiwifruit");

        if (ListA.size() > ListB.size()) {
            System.out.println("ListA has more elements than ListB");
        } else if (ListA.size() < ListB.size()) {
            System.out.println("List A has less elements than ListB");
        } else {
            System.out.println("the two list has equal number of elements");
        }
        System.out.println(ListA.indexOf("Avocado"));

        System.out.println(ListB.indexOf("Durian"));

        ListB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));

        System.out.println(ListA.get(2));
    }
}
