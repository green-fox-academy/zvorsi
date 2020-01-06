package FirstKata;

import java.util.ArrayList;
import java.util.Collections;

public class anagram {
    public static void main(String[] args) {
        String A = "alma";
        String B = "mala";

        System.out.println("word A is: " + A);
        System.out.println("word B is: " + B);
        System.out.println(isAnagram(A, B)? "word " + A + " and word " + B +" is FirstKata.anagram":"A and B are not anagrams");

    }

    public static boolean isAnagram(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        } else {
            ArrayList<Character> listA = new ArrayList<>();
            ArrayList<Character> listB = new ArrayList<>();

            for (int i = 0; i < A.length(); i++) {
                listA.add(i, A.charAt(i));
            }
            for (int i = 0; i < B.length(); i++) {
                listB.add(i, B.charAt(i));
            }
            Collections.sort(listA);
            Collections.sort(listB);

            return listA.equals(listB);
        }
    }
}
