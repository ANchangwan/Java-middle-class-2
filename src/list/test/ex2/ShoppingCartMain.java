package list.test.ex2;

import java.util.ArrayList;

public class ShoppingCartMain {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart(new ArrayList<>());

        cart.addItem(new Item("마늘",2000, 2));
        cart.addItem(new Item("상추", 3000, 4));

        cart.displayItems();



    }
}
