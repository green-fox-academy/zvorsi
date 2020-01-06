package poker;

import java.util.ArrayList;

public class Player {

    private String playerName;
    private ArrayList<String> hand;

    public Player(){
        playerName = "";
        hand = new ArrayList<String>();
    }

    public void setHand(ArrayList<String> hand) {
        this.hand = hand;
    }


    public ArrayList<String> getHand() {
        return hand;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
