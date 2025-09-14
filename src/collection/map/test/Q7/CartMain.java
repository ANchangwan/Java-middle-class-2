package collection.map.test.Q7;

public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("바나나", 500), 2);

        cart.printAll();

        cart.add(new Product("사과", 1000), 2);
        cart.printAll();

    }
}
