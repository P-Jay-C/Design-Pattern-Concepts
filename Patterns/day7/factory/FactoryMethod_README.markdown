# Factory Method Pattern

## Overview
The **Factory Method Pattern** is a **Creational** design pattern that defines an interface for creating objects but allows subclasses to decide which class to instantiate. It promotes loose coupling by deferring object creation to subclasses, enabling flexibility in object types.

## Purpose
- Delegate object creation to subclasses.
- Support extensibility for new object types.
- Decouple client code from concrete classes.

## Practice Task
**Task**: Implement a Factory Method pattern for a `DocumentCreator` that creates different types of documents (`PDFDocument`, `WordDocument`). Create an abstract `Document` class with a `generate()` method and concrete classes for each document type. Use factories to create documents and test their generation.

## Structure
- **Product**: An interface or abstract class for created objects (e.g., `Document`).
- **Concrete Product**: Classes implementing the product (e.g., `PDFDocument`, `WordDocument`).
- **Creator**: An abstract class or interface with a factory method (e.g., `DocumentCreator`).
- **Concrete Creator**: Subclasses implementing the factory method (e.g., `PDFDocumentCreator`, `WordDocumentCreator`).

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Document` as an abstract class with a `generate()` method.
- Implementing `PDFDocument` and `WordDocument` as concrete documents.
- Creating `DocumentCreator` with an abstract `createDocument()` method.
- Implementing `PDFDocumentCreator` and `WordDocumentCreator` to create specific documents.
- Including `FactoryMethodTest.java` to test document creation.

### Files
- `Document.java`: Abstract document class.
- `PDFDocument.java`, `WordDocument.java`: Concrete document classes.
- `DocumentCreator.java`: Abstract creator class.
- `PDFDocumentCreator.java`, `WordDocumentCreator.java`: Concrete creators.
- `FactoryMethodTest.java`: Tests the factory method pattern.

### Code Highlights
- `DocumentCreator` defines the `createDocument()` factory method.
- `PDFDocumentCreator` and `WordDocumentCreator` produce specific document types.
- `processDocument()` demonstrates usage of created documents.
- The test generates PDF and Word documents.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `Document.java`, `PDFDocument.java`, `WordDocument.java`, `DocumentCreator.java`, `PDFDocumentCreator.java`, `WordDocumentCreator.java`, and `FactoryMethodTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac Document.java PDFDocument.java WordDocument.java DocumentCreator.java PDFDocumentCreator.java WordDocumentCreator.java FactoryMethodTest.java
     ```
   - Run the test:
     ```bash
     java FactoryMethodTest
     ```

3. **Expected Output**:
   ```
   Generating PDF document
   Generating Word document
   ```

## Use Cases
- Creating different types of objects in frameworks (e.g., report generators).
- Supporting plugin architectures with varying implementations.
- Managing document types in content management systems.

## Examples in Java and Spring Boot
- **Java**:
  - **Collection Framework**: The `Iterator` interface in Java’s `java.util` package uses a factory method pattern. For example, `List.iterator()` is a factory method implemented by concrete classes like `ArrayList` or `LinkedList` to return specific iterator instances.
  - **ExecutorService**: The `Executors` class provides factory methods like `newFixedThreadPool()` to create different `ExecutorService` implementations, abstracting the concrete thread pool type.
- **Spring Boot**:
  - **RestTemplateBuilder**: Spring’s `RestTemplateBuilder` acts as a factory, providing methods to create customized `RestTemplate` instances with specific configurations (e.g., timeouts, interceptors).
  - **JpaRepositoryFactory**: In Spring Data JPA, the `JpaRepositoryFactory` creates repository implementations for specific entity types, allowing Spring to instantiate appropriate repository classes dynamically.
  - **ApplicationContext**: The `ApplicationContext` interface uses factory methods to create beans, with implementations like `AnnotationConfigApplicationContext` determining the specific bean creation logic.

## Advantages
- Promotes loose coupling by abstracting object creation.
- Follows the Open/Closed Principle for extensibility.
- Simplifies adding new product types.

## Disadvantages
- Increases complexity with additional classes.
- May lead to many subclasses for each product.
- Requires careful design to avoid tight coupling in factories.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Data JPA: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/