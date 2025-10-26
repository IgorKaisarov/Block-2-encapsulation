package org.skypro.skyshop.product;

public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

}
