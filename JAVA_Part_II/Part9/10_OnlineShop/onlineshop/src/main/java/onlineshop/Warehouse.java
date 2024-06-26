package onlineshop;

import java.util.*;

public class Warehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.price = new HashMap<>();
        this.stock = new HashMap<>();

    }

    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (price.containsKey(product)) {
            return price.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (stock.containsKey(product)) {
            return stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (stock.containsKey(product) && stock.get(product) > 0) {
            stock.put(product, stock.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return price.keySet();
    }
}
