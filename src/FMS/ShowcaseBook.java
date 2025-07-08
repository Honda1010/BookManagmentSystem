/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FMS;

/**
 *
 * @author mohaned
 */
public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
    }

    @Override
    public boolean isForSale() {
        return false;
    }

    @Override
    public void handlePurchase(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Quantum book store: Showcase books are not for sale.");
    }
}

