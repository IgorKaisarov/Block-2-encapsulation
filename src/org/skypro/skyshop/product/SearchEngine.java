package org.skypro.skyshop.product;

public class SearchEngine {

    String Searchable[];

    public Searchable[] search(String searchTerm) {
        return results;
    }

    Searchable[] results = new Searchable[5];
    int count = 0; // Счетчик найденных элементов


    for(
    Searchable item:
    public Searchable Searchable)
    private CharSequence searchTerm = null;

    {
        if (item.getSearchTerm().contains(searchTerm) && count < 5) {
            results[count] = item;
            count++;
        }
    }


    public SearchEngine(String[] searchable, CharSequence searchTerm) {
        Searchable = searchable;
        this.searchTerm = searchTerm;
    }
}
