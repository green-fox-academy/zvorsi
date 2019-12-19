package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Dominoes> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
        int counter = 0;

        while(counter < dominoes.size()-1){
            for (int i = counter+1; i < dominoes.size() ; i++) {
                if (dominoes.get(counter).getRightSide() == dominoes.get(i).getLeftSide()){
                    Dominoes temp = dominoes.get(i);
                    dominoes.remove(i);
                    dominoes.add(counter+1, temp);
                    counter++;
                }
            }
            System.out.println(dominoes);
        }

        System.out.println(dominoes);

    }

    static List<Dominoes> initializeDominoes() {
        List<Dominoes> dominoes = new ArrayList<>();
        dominoes.add(new Dominoes(5, 2));
        dominoes.add(new Dominoes(4, 6));
        dominoes.add(new Dominoes(1, 5));
        dominoes.add(new Dominoes(6, 7));
        dominoes.add(new Dominoes(2, 4));
        dominoes.add(new Dominoes(7, 1));
        return dominoes;
    }
}
