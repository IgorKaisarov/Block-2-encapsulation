package org.skypro.skyshop.basket;
import org.skypro.skyshop.product.Product;

import java.util.List;

public class ProductBasket {
    private List<Product> products;
    private int count = 0;


    public int specialCount(){
        int specialCount = 0;

        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
                if (product.isSpecial()) {
                    specialCount++;
                }
            }
        }
        System.out.println("Специальных товаров: " + specialCount);

        return specialCount;
    }


    public void addProduct(Product product) {
        if (count < products.size()) {
            products.set(count, product);
            count++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }


    public void printBasketContents() {
        boolean isEmpty = true;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName() + ": " + product.getPrice());
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("в корзине пусто");
        }
        System.out.println("Итого: " + getTotalCost()); // Выводим общую стоимость
    }


    public int getTotalCost() {
        int totalCost = 0;
        for (Product product : products) {
            if (product != null) {
                totalCost += product.getPrice();
            }
        }
        return totalCost;
    }
    public boolean isProductInBasket(String productName) {
        for (Product product : products) {
            if (product != null && product.getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }
    public void clearBasket() {
        for (int i = 0; i < products.size(); i++) {
            products.set(i, null);
        }
    }


}






