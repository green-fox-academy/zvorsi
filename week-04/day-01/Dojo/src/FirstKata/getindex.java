package FirstKata;

import java.util.ArrayList;

public class getindex {
    public static void main(String[] args) {

        ArrayList<String> searchThisList = new ArrayList<>();
        String searchItem = "alma";

        searchThisList.add("alma");
        searchThisList.add("korte");
        searchThisList.add("datolya");
        searchThisList.add("citrom");

        System.out.println(getindex(searchThisList, searchItem));
    }

    public static int getindex(ArrayList<String> searchThisList, String searchItem){
        return searchThisList.indexOf(searchItem);
    }

}
