package org.skypro.skyshop.product;

public class SearchEngine {
    private final Searchable[] items;

    public SearchEngine(int size) {
        this.items = new Searchable[size];
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

