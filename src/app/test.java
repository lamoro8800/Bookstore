package app;

import model.*;

public class test {
    public static void main(String[] args) {
        Bookstore store = new Bookstore();

        store.addBook(new PaperBook("123", "Java Basics", "Ahmed", 2020, 150, 10));
        store.addBook(new EBook("124", "Learn Python", "Sara", 2024, 100, "PDF"));
        store.addBook(new ShowcaseBook("125", "Demo C++", "Ziad", 2015));

        System.out.println("******************\n");
        double cost1 = store.buyBook("123", 2, "Ahmed@gmail.com", "Cairo");
        System.out.println("Cost: " + cost1);

        System.out.println("******************\n");
        double cost2 = store.buyBook("124", 1, "Ahmed@gmail.com", "N/A");
        System.out.println("Cost: " + cost2);

        System.out.println("******************\n");
        store.removeOutdated(3);
    }
}
