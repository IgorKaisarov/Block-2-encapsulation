package org.skypro.skyshop.product;

public abstract class Product implements Searchable {
    public String name;


    public Product(String name) {
        this.name = name;
    }

    public abstract double getPrice();

    public abstract boolean isSpecial();

    @Override
    public String getSearchTerm() {
        return this.name; // Предполагается, что name — это поле класса Product
    }


    @Override
    public String getContentType() {
        return "PRODUCT";
    }


    @Override
    public String getName() {
        return this.name;
    }


}
