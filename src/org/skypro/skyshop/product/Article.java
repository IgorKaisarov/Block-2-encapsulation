package org.skypro.skyshop.product;

public class Article {

    public String articleTitle;
    public String articleText;

    @Override
    public String toString() {
        return "Article{" +
                "articleText='" + articleText + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                '}';
    }
}
