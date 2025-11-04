package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private int basePrice;

    @Override
    public double getPrice() {
        return basePrice * (1 - discount / 100.0);
    }

    public DiscountedProduct(String name, int basePrice, int discount) {
        super(name);
        this.basePrice = basePrice;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + discount + "% скидка)";
    }

    private int discount;

    public int getDiscount() {
        return discount;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

}
