/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FMS;

/**
 *
 * @author mohaned
 */
public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public void handlePurchase(int quantity, String email, String address) {
        if (quantity > 1) {
            throw new IllegalArgumentException("Quantum book store: EBooks can only be bought in quantity of 1.");
        }
        System.out.println("Quantum book store: $" + price + " paid.");
        System.out.println("Quantum book store: Sending ebook to " + email + " via MailService.");
    }
}
