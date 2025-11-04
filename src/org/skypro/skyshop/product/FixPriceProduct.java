package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    public FixPriceProduct(String name) {
        super(name);
    }

    private static final double FIXED_PRICE = 100.0; // Задай своё значение

    @Override
    public double getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public String toString() {
        return getName() + ": Фиксированная цена " + getPrice();
    }


    @Override
    public boolean isSpecial() {
        return true;
    }

}
