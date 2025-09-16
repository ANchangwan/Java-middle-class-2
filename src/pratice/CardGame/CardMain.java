package pratice.CardGame;

public class CardMain {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        player1.printAll();
        player2.printAll();

        if(player1.deckSum() == player2.deckSum()) {
            System.out.println("무승부");
        }else if(player1.deckSum() < player2.deckSum()) {
            System.out.println(
                    "player2 win"
            );
        }else{
            System.out.println("player1 win");
        }


//        player1.printAll();
    }
}
