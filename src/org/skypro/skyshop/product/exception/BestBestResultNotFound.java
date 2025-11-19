package org.skypro.skyshop.product.exception;

public class BestBestResultNotFound extends Exception {

    public BestBestResultNotFound(String search) {
        super("Лучший результат для строки "  + search + " найден ");
    }
}
