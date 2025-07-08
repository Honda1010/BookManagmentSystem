/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FMS;

/**
 *
 * @author mohaned
 */
public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public void handlePurchase(int quantity, String email, String address) {
        if (quantity > stock) {
            throw new IllegalArgumentException("Quantum book store: Not enough stock for ISBN: " + isbn);
        }
        stock -= quantity;
        System.out.println("Quantum book store: $" + (price * quantity) + " paid.");
        System.out.println("Quantum book store: Shipping " + quantity + " copy(ies) of book to " + address + " via ShippingService.");
    }
}

