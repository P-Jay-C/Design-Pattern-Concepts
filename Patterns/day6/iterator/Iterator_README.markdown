# Iterator Pattern

## Overview
The **Iterator Pattern** is a **Behavioral** design pattern that provides a way to access elements of a collection sequentially without exposing its underlying representation. It encapsulates iteration logic, making it reusable and independent of the collection’s structure.

## Purpose
- Enable traversal of a collection without exposing its implementation.
- Provide a uniform interface for iterating over different collections.
- Support multiple simultaneous iterations.

## Practice Task
**Task**: Implement an Iterator pattern for a `BookCollection` that stores books and allows iteration over them. Create a `Book` class, a `BookCollection` with an `Iterator` interface, and a concrete iterator to traverse books. Test by iterating over a collection of books and printing their titles.

## Structure
- **Iterator**: An interface defining methods for traversal (e.g., `hasNext()`, `next()`).
- **Concrete Iterator**: Implements the iterator for a specific collection (e.g., `LibraryIterator`).
- **Aggregate**: An interface for collections that provide iterators (e.g., `BookCollection`).
- **Concrete Aggregate**: Implements the aggregate and manages the collection (e.g., `Library`).
- **Client**: Uses the iterator to traverse the collection.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Book` as a simple class with a title.
- Creating `Iterator` and `BookCollection` interfaces.
- Implementing `Library` as a concrete collection.
- Implementing `LibraryIterator` to traverse books.
- Including `IteratorTest.java` to test iteration over a book collection.

### Files
- `Book.java`: Class representing a book.
- `Iterator.java`: Interface for iterators.
- `BookCollection.java`: Interface for book collections.
- `Library.java`: Concrete book collection.
- `LibraryIterator.java`: Concrete iterator.
- `IteratorTest.java`: Tests the iterator pattern.

### Code Highlights
- `Library` uses an `ArrayList` internally but exposes iteration via `createIterator()`.
- `LibraryIterator` tracks the current position and provides `hasNext()` and `next()`.
- The test adds books to a library and iterates over them to print titles.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `Book.java`, `Iterator.java`, `BookCollection.java`, `Library.java`, `LibraryIterator.java`, and `IteratorTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac Book.java Iterator.java BookCollection.java Library.java LibraryIterator.java IteratorTest.java
     ```
   - Run the test:
     ```bash
     java IteratorTest
     ```

3. **Expected Output**:
   ```
   Book: Design Patterns
   Book: Clean Code
   Book: Refactoring
   ```

## Use Cases
- Traversing collections in applications (e.g., database query results).
- Supporting custom iteration in data structures (e.g., trees, graphs).
- Iterating over resources in Spring Boot (e.g., REST API responses).

## Advantages
- Encapsulates iteration logic, hiding collection details.
- Supports multiple simultaneous iterations.
- Simplifies adding new collection types.

## Disadvantages
- May be unnecessary for simple collections with built-in iterators (e.g., Java’s `Iterable`).
- Increases complexity with additional classes.
- Can be less efficient for small datasets.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Iterator: https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html