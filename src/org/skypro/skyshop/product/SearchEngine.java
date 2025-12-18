package org.skypro.skyshop.product;

import org.skypro.skyshop.product.exception.BestResultNotFound;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SearchEngine {
    private final List<Searchable> items;

    public SearchEngine() {
        this.items = new LinkedList<>();
    }


    public Searchable findSearchable(String search) throws BestResultNotFound {

        int maxAmount = 0;
        Searchable result = null;

        for (Searchable searchable : items) {
            if (searchable == null) {
                continue;
            }
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
            throw new BestResultNotFound(search);
        }
        return result;

    }

    public List<Searchable> search  (String searchTerm) {
        List<Searchable> result = new LinkedList<>();
        for (Searchable item : items) {
            if (item != null && item.getSearchTerm().contains(searchTerm)) {
                result.add(item);
            }
        }
        return result;
    }

    public void add(Searchable searchable) {
        if (searchable != null) {
            items.add(searchable);

        }


    }




}

