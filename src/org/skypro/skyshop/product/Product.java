package org.skypro.skyshop.product;

public abstract class Product implements Searchable {
    public String name;


    public Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Неправильное имя продукта ");
        }
        this.name = name;
    }

    public abstract double getPrice();

    public abstract boolean isSpecial();

    @Override
    public String getSearchTerm() {
        return this.name;
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
