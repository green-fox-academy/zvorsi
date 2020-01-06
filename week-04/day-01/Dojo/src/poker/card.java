package poker;

public class card {

    private Character cardSuit;
    private Character cardValue;


    public Character getCardSuit() {
        return cardSuit;
    }

    public Character getCardValue() {
        return cardValue;
    }

    public card(Character cardSuit, Character cardValue) {
        this.cardSuit = cardSuit;
        this.cardValue = cardValue;
    }


}
