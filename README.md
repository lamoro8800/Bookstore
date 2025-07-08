# 📚 Quantum Book Store

An extensible Java-based bookstore management system.

---

## 🚀 Features

- Add books to inventory with ISBN, title, author, price, year
- Supports 3 book types:
  - 📦 PaperBook – shippable with stock control
  - 💾 EBook – delivered via email
  - 🖼️ ShowcaseBook – not for sale (demo only)
- Remove outdated books older than a specified number of years
- Buy books by ISBN with quantity, email, and address
- Extensible architecture for adding new product types

---

## 🧩 Project Structure

```bash
book_store/
├── app/
│   └── test.java                           # Test runner
├── model/
│   ├── Book.java                           # Abstract base class
│   ├── PaperBook.java
│   ├── EBook.java
│   ├── ShowcaseBook.java
│   └── Bookstore.java             
├── service/
│   ├── MailService.java
│   └── ShippingService.java
```
## How to Run

### Compile all Java files:

```bash
javac app/test.java
```
### Run the test class

```bash
java app.test
```

## Tech Stack

- Java 8+
- Object-Oriented Design
- No external libraries required

---

## Extensibility

To add a new book type:

1. Extend the abstract `Book` class
2. Implement the `isAvailable()` and `buy()` methods
3. Register it through the `Bookstore` class

