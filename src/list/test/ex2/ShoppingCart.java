package list.test.ex2;

import java.util.ArrayList;
import java.util.Objects;

public class ShoppingCart {
     ArrayList<Item> itmes;

    public ShoppingCart(ArrayList<Item> itmes) {
        this.itmes = itmes;
    }

    public void addItem(Item item) {
         itmes.add(item);
     }

     public void displayItems() {
         System.out.println("장바구니 상품 출력");
         for(Item item : itmes) {
             System.out.println(item);
         }
         System.out.println("전체 가격: "+ calculateTotalPrice());
     }

     private int calculateTotalPrice() {
        int sum = 0;
        for(Item item : itmes) {
            sum += item.getTotalPrice();
        }
        return sum;
     }
}
