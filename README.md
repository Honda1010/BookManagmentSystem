# 📚 BookManagementSystem

A simple, extensible Java-based online bookstore system supporting multiple book types:
- **PaperBook** (stock-handled physical copies ready for shipping)  
- **EBook** (digital files delivered via email)  
- **ShowcaseBook** (demo-only books, not available for sale)

Built with clean OOP design: abstract base classes, interfaces, and polymorphism.

---

## 🚀 Features

- Add books (ISBN, title, author, year, price, plus type-specific info)
- Remove outdated books (based on a specified age)
- Purchase books:
  - Checks availability and stock for PaperBook
  - Delivers via ShippingService (physical) or MailService (ebook)
  - Throws errors for unavailable or demo-only books
  - Returns total paid amount
- Extensible: simply sub-class `Book` and override purchase handling for new types

---

## 📸 Screenshots

### ➕ OUTPUT Terminal
![Add Book Screenshot](screenshots/add_book.png)s

---

## 🛠️ Getting Started

1. **Clone the repo**  
   ```bash
   git clone https://github.com/Honda1010/BookManagmentSystem.git
