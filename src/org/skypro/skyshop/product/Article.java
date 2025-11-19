package org.skypro.skyshop.product;

public class Article implements Searchable {

    public String articleTitle;
    public String articleText;

    public Article(String articleTitle, String articleText) {
        this.articleTitle = articleTitle;
        this.articleText = articleText;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

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
    public String getContentType() {
        return "ARTICLE";
    }


    @Override
    public String getName() {
        return this.articleTitle;
    }


}
