import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class Main {
    public static void main(String[] args) {

        // Создание экземпляров продуктов
        Product product1 = new SimpleProduct("Помидоры", 90);
        Product product2 = new SimpleProduct("Яблоки", 110);
        Product product3 = new SimpleProduct("Ананас", 200);
        Product product4 = new SimpleProduct("Грейпфрут", 115);
        Product product5 = new SimpleProduct("Мандарины", 99);

        // Создание экземпляра корзины
        ProductBasket basket = new ProductBasket();

        // Вызовы методов для демонстрации
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);

        basket.printBasketContents();
        System.out.println("Total cost: " + basket.getTotalCost());

        // Проверка наличия продукта
        System.out.println("Contains Яблоки: " + basket.isProductInBasket("Яблоки"));

        // Очистка корзины
        basket.clearBasket();
        basket.printBasketContents();
    }


    }
