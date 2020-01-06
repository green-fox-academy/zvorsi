package poker;

public class main {
    public static void main(String[] args) {

        // kell ket player - done
        // kell egy pakli kartya - done
        // osztani kell nekik 5-5 lapot
        // ellenorizni a kezeket
        // osszehasonlitani a kezeket

        Player player1 = new Player();
        Player player2 = new Player();

        Character[] cardSuit = new Character[]{'C', 'D', 'H', 'S'};
        Character[] cardValue = new Character[]{'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};

        for (int i = 0; i < cardSuit.length; i++) {
            for (int j = 0; j < cardValue.length; j++) {

                card card = new card(cardSuit[i],cardValue[j]);

                System.out.println(card.getCardSuit() + " " + card.getCardValue());
            }
        }
    }
}
