package collection.test2;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
   private ArrayList<Card> hands;
   private String player;
   public Player(String player) {
       this.player = player;
       this.hands = new ArrayList<>();
   }
   public void drawCard(Deck deck) {
      hands.add(deck.drawCard());
   }

   public int rankSum(){
       int sum = 0;
       for(Card hand :hands){
           sum += hand.getRank();
       }
       return sum;
   }

    public void showHand() {
        hands.sort(null);
        System.out.println(player + "의 카드: " + hands + ", 합계: " + rankSum()); }

    public String getName() {
        return player;
    }
}