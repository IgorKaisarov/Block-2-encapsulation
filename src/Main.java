import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();

        Product product1 = new SimpleProduct("Помидоры", 90);
        Product product2 = new SimpleProduct("Яблоки", 110);
        Product product3 = new SimpleProduct("Яблоки", 200);
        Product product4 = new SimpleProduct("Грейпфрут", 115);
        Product product5 = new SimpleProduct("Мандарины", 99);


        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);

        basket.removeProductByName("Яблоки");

        List<Product> undefinedProducts = basket.removeProductByName(" Апельсины ");
        if (undefinedProducts.isEmpty()) {
            System.out.println(" Список пуст ");
        }
        basket.printBasketContents();

    }


}
