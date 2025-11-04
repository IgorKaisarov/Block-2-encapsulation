package org.skypro.skyshop.product;

public class SearchEngine {

    String Searchable[];

    public Searchable[] search(String searchTerm) {
        return results;
    }

    Searchable[] results = new Searchable[5];
    int count = 0; // Счетчик найденных элементов

    searchables[0] = new Article("В мире животных", "Оглавление");


    for (Searchable item : searchables) {
        if (item != null && item.getSearchTerm().contains(searchTerm)) {
            if(item.getSearchTerm().contains(searchTerm) { } &&count< 5) {
                results[count] = item;
                count++;
            }
        }
    }



    public SearchEngine(String[] searchable, CharSequence searchTerm) {
        Searchable = searchable;
        this.searchTerm = searchTerm;
    }
}
