package com.xyg.bean;

public class Book {
    private Integer bookId;
    private String name;
    private String author;
    private float price;
    private String isbn;
    private String pubName;
    private byte[] preface;

    public Book(Integer bookId, String name, String author, float price, String isbn, String pubName, byte[] preface) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.pubName = pubName;
        this.preface = preface;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public byte[] getPreface() {
        return preface;
    }

    public void setPreface(byte[] preface) {
        this.preface = preface;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }


    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +

                '}';
    }
}
