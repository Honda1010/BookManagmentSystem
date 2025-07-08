/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FMS;

/**
 *
 * @author mohaned
 */
public class Main {
      public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        store.addBook(new PaperBook("P001", "Java Basics", 2015, 150.0, "John Doe", 10));
        store.addBook(new EBook("E001", "Learn Python", 2020, 100.0, "Jane Smith", "PDF"));
        store.addBook(new ShowcaseBook("S001", "Ancient Maps", 1990, 999.0, "Dr. Maps"));

        System.out.println("\n--- Buying Paper Book ---");
        store.buyBook("P001", 2, "buyer@example.com", "123 Main St");

        System.out.println("\n--- Buying EBook ---");
        store.buyBook("E001", 1, "ebookbuyer@example.com", "");

        System.out.println("\n--- Attempting to Buy Showcase Book ---");
        try {
            store.buyBook("S001", 1, "buyer@example.com", "123 Main St");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Removing Outdated Books ---");
        store.removeOutdatedBooks(10, 2025);
    }
}
