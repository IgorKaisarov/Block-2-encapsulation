package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket {
    private final List<Product> products = new LinkedList<>();


    public int specialCount() {
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
        if (product != null) {
            products.add(product);
            System.out.println("Продукт " + product.getName() + " успешно добавлен");
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }


    public void printBasketContents() {
        System.out.println(" Содержимое корзины: ");
        if (products.isEmpty()) {
            System.out.println(" В корзине пусто");
        } else {
            for (Product product : products) {
                System.out.println(product.getName() + " : " + product.getPrice());
            }

        }
        System.out.println(" Итого: " + getTotalCost());
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
      products.clear();
        System.out.println(" Корзина очищена");

    }

    public List<Product> removeProductByName (String product) {
        List<Product> removedProducts = new LinkedList<>();
        Iterator<Product> iterator = products.iterator();
        if (products.isEmpty()) {
            System.out.println(" Список пуст: ");
            return products;
        }

        while (iterator.hasNext()) {
            Product currentProduct = iterator.next();
            if (currentProduct != null && currentProduct.getName().equals(product)) {
                iterator.remove();
                removedProducts.add(currentProduct);
                System.out.println(" Продукт " + product + " удален из корзины ");
            }
        }
        if (removedProducts.isEmpty()) {
            System.out.println(" Продукт " + product + " не найдне в корзине ");
        } else {
            System.out.println(" Удалено продуктов " + product + " " + removedProducts.size() +  " шт ");
        }
        return removedProducts;
    }



}






