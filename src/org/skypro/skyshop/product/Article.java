package org.skypro.skyshop.product;

public class Article implements Searchable {

    public String articleTitle;
    public String articleText;

    @Override
    public String toString() {
        return "Article{" +
                "articleTitle='" + articleTitle + '\'' +
                ", articleText='" + articleText + '\'' +
                '}';

    }

    @Override
    public String getSearchTerm() {
        return articleTitle + " " + articleText; // title и text — это поля класса Article
    }

    @Override
    public String getSearchContent() {
        return "";
    }

    @Override
    public String getSearchable() {
        return "";
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }


    @Override
    public String getName() {
        return this.articleTitle;
    }

    @Override
    public String getContent() {
        return "";
    }


}
