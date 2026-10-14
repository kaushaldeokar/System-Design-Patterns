# Designing a Library Management System

## Requirements
1. The library management system should allow librarians to manage books, members, and borrowing activities.
2. The system should support adding, updating, and removing books from the library catalog.
3. Each book should have details such as title, author, ISBN, publication year, and availability status.
4. The system should allow members to borrow and return books.
5. Each member should have details such as name, member ID, contact information, and borrowing history.
6. The system should enforce borrowing rules, such as a maximum number of books that can be borrowed at a time and loan duration.
7. The system should handle concurrent access to the library catalog and member records.
8. The system should be extensible to accommodate future enhancements and new features.

## UML Class Diagram

![](librarymanagementsystem-class-diagram.png)


## Classes, Interfaces and Enumerations
1. The **Book** class represents a book in the library catalog, with properties such as ISBN, title, author, publication year, and availability status.
2. The **Member** class represents a library member, with properties like member ID, name, contact information, and a list of borrowed books.
3. The **LibraryManager** class is the core of the library management system and follows the Singleton pattern to ensure a single instance of the library manager.
4. The LibraryManager class uses concurrent data structures (ConcurrentHashMap) to handle concurrent access to the library catalog and member records.
5. The LibraryManager class provides methods for adding and removing books, registering and unregistering members, borrowing and returning books, and searching for books based on keywords.
6. The **LibraryManagementSystem** class serves as the entry point of the application and demonstrates the usage of the library management system.

## Class Design

### 1. LibraryManagementSystem
- **Fields:** List<Book> books, List<Member> members, List<Loan> loans, Catalog catalog
- **Methods:** addBook(Book), addMember(Member), borrowBook(Member, Book), returnBook(Member, BookCopy), getLoans(Member), searchBooks(String query), etc.

### 2. Book
- **Fields:** String title, String author, String isbn, List<BookCopy> copies

### 3. BookCopy
- **Fields:** int copyId, Book book, boolean isAvailable

### 4. Member
- **Fields:** int id, String name, List<Loan> loans

### 5. Loan
- **Fields:** int id, Member member, BookCopy bookCopy, Date loanDate, Date returnDate

### 6. Catalog
- **Fields:** List<Book> books
- **Methods:** searchByTitle(String), searchByAuthor(String), searchByISBN(String)

---

## Example Usage

```java
LibraryManagementSystem system = new LibraryManagementSystem();
Book book = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
system.addBook(book);

Member alice = new Member(1, "Alice");
system.addMember(alice);

system.borrowBook(alice, book);
system.returnBook(alice, book.getCopies().get(0));
```

---

## Demo

See `LibraryManagementSystemDemo.java` for a sample usage and simulation of the library management system.

---

## Extending the Framework

- **Add reservations:** Allow members to reserve books that are currently checked out.
- **Add fines:** Track overdue books and calculate fines.
- **Add notifications:** Notify members about due dates, reservations, or new arrivals.

---