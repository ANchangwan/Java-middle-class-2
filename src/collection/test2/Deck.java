package collection.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<Card>();

    public Deck() {
        for(int i =1; i <= 13; i++){
            cards.add(new Card(i,Suit.CLUB));
            cards.add(new Card(i,Suit.DIAMOND));
            cards.add(new Card(i,Suit.HEART));
            cards.add(new Card(i,Suit.SPADE));
        }
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        return cards.removeFirst();
    }
}
