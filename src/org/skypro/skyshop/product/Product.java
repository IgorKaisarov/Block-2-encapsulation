package org.skypro.skyshop.product;

public abstract class Product {
    public String name;

    public String getName() {
        return name;
    }



    public abstract double getPrice();

    public abstract boolean isSpecial();

    public Product(String name) {
        this.name = name;
    }



}
