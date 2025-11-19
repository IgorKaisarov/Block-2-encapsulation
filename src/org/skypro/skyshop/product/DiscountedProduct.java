package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private int basePrice;

    public DiscountedProduct(String name, int basePrice, int discount) {
        super(name);
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Недопустимая стоимость продукта со скидкой " + basePrice);
        }
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Недопустимая скидка продукта " + basePrice);
        }
        this.basePrice = basePrice;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return basePrice * (1 - discount / 100.0);
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
