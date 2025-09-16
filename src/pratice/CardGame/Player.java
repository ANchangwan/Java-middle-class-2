package pratice.CardGame;

import java.util.List;
import java.util.Objects;

public class Player {
    Deck deck = new Deck();

    public void printAll(){
       List<String> list =  deck.shuffle();
       System.out.println(list + " 합계: "+ deck.sum());
    }

    public int deckSum(){
        return deck.sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(deck, player.deck);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(deck);
    }
}
