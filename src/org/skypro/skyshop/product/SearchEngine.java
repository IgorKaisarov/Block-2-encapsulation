package org.skypro.skyshop.product;

import org.skypro.skyshop.product.exception.BestBestResultNotFound;

public class SearchEngine {
    private final Searchable[] items;

    public SearchEngine(int size) {
        this.items = new Searchable[size];
    }

    public Searchable findSearchable(String search) throws BestBestResultNotFound {

        int maxAmount = 0;
        Searchable result = null;

        for (int i = 0; i < items.length; i++) {
            Searchable searchable = items[i];
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
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getSearchTerm().contains(searchTerm)) {

                finalItems[amount] = items[i];
                amount++;
                if (amount >= 5) {
                    break;
                }
            }
        }

        return finalItems;

    }

    public void add(Searchable searchable) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = searchable;
                break;
            }
        }
    }
}

