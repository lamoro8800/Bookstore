package model;

import java.util.*;

public class Bookstore {
    private List<Book> inventory = new ArrayList<>();
    private final int CURRENT_YEAR = 2025;

    public void addBook(Book book) {
        inventory.add(book);
        System.out.println("Book added");
    }

    public List<Book> removeOutdated(int maxAge) {
        List<Book> removed = new ArrayList<>();
        Iterator<Book> iter = inventory.iterator();
        while (iter.hasNext()) {
            Book b = iter.next();
            if (CURRENT_YEAR - b.getYear() > maxAge) {
                iter.remove();
                removed.add(b);
                System.out.println("Book removed - " + b.getTitle());
            }
        }
        return removed;
    }


    public double buyBook(String isbn, int quantity, String email, String address) {
        for (Book b : inventory) {
            if (b.getIsbn().equals(isbn)) {
                if (!b.isAvailable()) throw new RuntimeException("Book not available");
                System.out.println("Book purchased");
                return b.buy(quantity, email, address);
            }
        }
        throw new RuntimeException("Book not found");
    }
}