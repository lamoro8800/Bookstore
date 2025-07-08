package model;

import service.ShippingService;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, String author, int year, double price, int stock) {
        super(isbn, title, author, year, price);
        this.stock = stock;
    }

    @Override
    public boolean isAvailable() {
        return stock > 0;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (stock < quantity) throw new RuntimeException("Not enough stock");
        stock -= quantity;
        ShippingService.send(address);
        return price * quantity;
    }
}
