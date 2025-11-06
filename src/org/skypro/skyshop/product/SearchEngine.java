package org.skypro.skyshop.product;

public class SearchEngine {

    Searchable Searchable[];

    public Searchable[] search(String searchTerm) {
        Searchable[] results = new Searchable[5]; int count = 0; // Счетчик найденных элементов
        searchables[0] = new Article("В мире животных", "Оглавление");


        for (Searchable item : searchables) {
            if (item != null && item.getSearchTerm().contains(searchTerm)) {
                if(item.getSearchTerm().contains(searchTerm) {
                } &&count< 5) {
                    results[count] = item;
                    count++;
                }
            }
        }
        return results; }



//    public SearchEngine(String[] searchable, CharSequence searchTerm) {
//        Searchable = searchable;
//        this.searchTerm = searchTerm;
//    }

    public SearchEngine(int size) {
        this.searchables = new Searchable[size];
    }

}
