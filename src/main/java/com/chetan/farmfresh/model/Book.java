package com.chetan.farmfresh.model;

public class Book {

    public int bookId;
    public String name;
    public String bookPicUrl;
    public int price;
    public String author;

    public Book(int bookId, String name, int price, String author, String bookPicUrl) {
        this.bookId = bookId;
        this.name = name;
        this.price = price;
        this.author = author;
        this.bookPicUrl = bookPicUrl;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookPicUrl() {
        return bookPicUrl;
    }

    public void setBookPicUrl(String bookPicUrl) {
        this.bookPicUrl = bookPicUrl;
    }
}
