package model;

import service.MailService;

public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, String author, int year, double price, String fileType) {
        super(isbn, title, author, year, price);
        this.fileType = fileType;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        MailService.send(email);
        return price * quantity;
    }
}
