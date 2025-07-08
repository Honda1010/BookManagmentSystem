# BookManagementSystem

A simple, extensible Java-based online bookstore system that supports various book types:

- **PaperBook** – physical books with stock control and shipping
- **💾 EBook** – digital files delivered via email
- **ShowcaseBook** – demo or display books not available for sale

The system is designed with solid OOP principles using abstract classes and polymorphism to ensure easy extensibility.

---

## Features

- Add books with: ISBN, title, author, year, price, and type-specific data
- Remove outdated books older than a given number of years
- Purchase functionality:
  - Validates stock or availability
  - Delivers via **ShippingService** (PaperBook) or **MailService** (EBook)
  - Returns total paid amount
  - Handles invalid operations (e.g., buying a ShowcaseBook)

- Easily extendable:
  - Add new book types by subclassing the `Book` base class
  - No need to modify the existing store logic

---

## Terminal Output Screenshots

Below are some sample outputs from the terminal when running the system via `QuantumBookstoreFullTest`.

### Main Output
![MainOutput](Screenshots/MainOutput.png)

---

## 🛠️ Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Honda1010/BookManagmentSystem.git
