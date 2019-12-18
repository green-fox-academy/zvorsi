package DiceSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();

        System.out.println(diceSet.getCurrent());
        System.out.println(diceSet.roll());

        for (int i = 0; i < diceSet.dice.size(); i++) {

            while (diceSet.getCurrent(i) != 6) {
                diceSet.reroll(i);
            }
            System.out.println(diceSet.getCurrent());
        }

 /*           while (diceSet.getCurrent(1) != 6){
                diceSet.reroll(1);
            }
            System.out.println(diceSet.getCurrent());

            while (diceSet.getCurrent(2) != 6){
                diceSet.reroll(2);
            }
        System.out.println(diceSet.getCurrent());*/
       }

        /*System.out.println(diceSet.getCurrent());
        System.out.println(diceSet.getCurrent(5));
        diceSet.reroll();
        System.out.println(diceSet.getCurrent());
        diceSet.reroll(4);
        System.out.println(diceSet.getCurrent());*/
    }


