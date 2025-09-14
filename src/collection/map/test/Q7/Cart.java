package collection.map.test.Q7;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Product, Integer> products = new HashMap<>();
    private int quantity;

    public void add(Product product, int quantity) {
        Integer existingQuantity = products.getOrDefault(product, 0);
        products.put(product, existingQuantity + quantity);
        // hashcode랑 equals를 구현 안하면 다른 키값으로 map이 저장됨
    }

    public void minus(Product product, int quantity) {
        int currentQuantity = products.getOrDefault(product, 0);
        int updatedQuantity = currentQuantity - quantity;

        if (updatedQuantity > 0) {
            products.put(product, updatedQuantity);
        } else {
            products.remove(product);
        }
    }

    public void printAll(){
        System.out.println("====현재 상품====");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                ", quantity=" + quantity +
                '}';
    }
}
