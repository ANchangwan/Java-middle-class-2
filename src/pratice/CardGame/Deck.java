package pratice.CardGame;

import java.util.*;

public class Deck {
    private List<String> deck = new ArrayList<>();
    private List<String> cards = new ArrayList<>();

    public Deck() {
        for(int i =1; i <= 13; i++){
            deck.add(String.valueOf(i) + Card.CLUB);
            deck.add(String.valueOf(i) + Card.DIAMOND);
            deck.add(String.valueOf(i) + Card.SPADE);
            deck.add(String.valueOf(i) + Card.HEART);
        }
    }

    public List<String> shuffle(){
        Collections.shuffle(deck);
        for(int i =0; i < 5; i++){
            cards.add(deck.getFirst());
            deck.remove(0);
        }
        return cards;
    }
    public int sum(){
        int sum = 0;
        for (String card : cards) {
            // 숫자 부분만 추출 (문자열 앞에서부터 숫자만)
            String numberStr = card.replaceAll("[^0-9]", "");
            int number = Integer.parseInt(numberStr);
            sum += number;
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck1 = (Deck) o;
        return Objects.equals(deck, deck1.deck) && Objects.equals(cards, deck1.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deck, cards);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                ", cards=" + cards +
                '}';
    }
}
