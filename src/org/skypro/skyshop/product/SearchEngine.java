package org.skypro.skyshop.product;

import org.skypro.skyshop.product.exception.BestBestResultNotFound;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SearchEngine {
    private final List<Searchable> items;

    public SearchEngine(List<Searchable> items) {
        this.items = items;
    }


    public Searchable findSearchable(String search) throws BestBestResultNotFound {

        int maxAmount = 0;
        Searchable result = null;

        for (int i = 0; i < items.size(); i++) {
            Searchable searchable = items.get(i);
            String str = searchable.getSearchTerm();
            int amount = 0;
            int index = 0;
            int subIndex = str.indexOf(search, index);

            while (subIndex != -1) {
                amount++;
                index = subIndex + search.length();
                subIndex = str.indexOf(search, index);
            }

            if (amount > maxAmount) {
                maxAmount = amount;
                result = searchable;

            }

        }
        if (result == null) {
            throw new BestBestResultNotFound(search);
        }
        return result;

    }

    public Searchable[] search(String searchTerm) {
        int amount = 0;
        Searchable[] finalItems = new Searchable[5];
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null && items.get(i).getSearchTerm().contains(searchTerm)) {

                finalItems[amount] = items.get(i);
                amount++;
                if (amount >= 5) {
                    break;
                }
            }
        }

        return finalItems;

    }

    public void add(Searchable searchable) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) == null) {
                items.set(i, searchable);
                break;
            }
        }
    }

    public List<Product> removeProduct (String product, LinkedList<Product> products) {
        List<Product> removedProducts = new LinkedList<>();
        if (products.isEmpty()) {
            System.out.println(" Список пуст: ");
            return products;
        }

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product currentProduct = iterator.next();
            if (currentProduct.equals(product)) {
                removedProducts.add(currentProduct);
                iterator.remove();
            }
        }
        return removedProducts;
    }


}

