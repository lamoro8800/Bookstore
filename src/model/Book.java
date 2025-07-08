package model;

public abstract class Book {
    protected String isbn, title, author;
    protected int year;
    protected double price;

    public Book(String isbn, String title, String author, int year, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public abstract boolean isAvailable();
    public abstract double buy(int quantity, String email, String address);

    public int getYear() { return year; }
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
}
