/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FMS;

/**
 *
 * @author mohaned
 */
import java.util.*;

public class QuantumBookstore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Added -> " + book);
    }

    public List<Book> removeOutdatedBooks(int maxYearsOld, int currentYear) {
        List<Book> removed = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next().getValue();
            if (currentYear - book.getYear() > maxYearsOld) {
                removed.add(book);
                iterator.remove();
                System.out.println("Quantum book store: Removed outdated -> " + book);
            }
        }
        return removed;
    }

    public void buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) {
            throw new IllegalArgumentException("Quantum book store: Book not found.");
        }
        if (!book.isForSale()) {
            throw new UnsupportedOperationException("Quantum book store: Book is not for sale.");
        }
        book.handlePurchase(quantity, email, address);
    }
}

