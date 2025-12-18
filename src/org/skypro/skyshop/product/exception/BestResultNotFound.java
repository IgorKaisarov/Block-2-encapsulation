package org.skypro.skyshop.product.exception;

public class BestResultNotFound extends Exception {

    public BestResultNotFound(String search) {
        super("Лучший результат для строки "  + search + " найден ");
    }
}
