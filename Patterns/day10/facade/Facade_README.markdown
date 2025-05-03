# Facade Pattern

## Overview
The **Facade Pattern** is a **Structural** design pattern that provides a simplified interface to a complex subsystem, hiding its intricacies from clients. It promotes ease of use and reduces coupling between clients and subsystems.

## Purpose
- Simplify interaction with complex systems.
- Reduce client-subsystem coupling.
- Provide a unified entry point for multiple subsystems.

## Practice Task
**Task**: Implement a Facade pattern for an `OrderProcessingSystem` that simplifies interactions with subsystems for inventory, payment, and shipping. Create a `Facade` to provide a unified interface for placing orders. Test by placing orders with different items and payment methods.

## Structure
- **Subsystem Classes**: Independent classes handling specific tasks (e.g., `InventorySystem`, `PaymentSystem`, `ShippingSystem`).
- **Facade**: A class providing a simplified interface to the subsystems (e.g., `OrderProcessingFacade`).
- **Client**: Interacts with the facade instead of subsystems directly.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `InventorySystem`, `PaymentSystem`, and `ShippingSystem` as subsystems.
- Implementing `OrderProcessingFacade` to coordinate subsystem interactions.
- Including `FacadeTest.java` to test order placement.

### Files
- `InventorySystem.java`, `PaymentSystem.java`, `ShippingSystem.java`: Subsystem classes.
- `OrderProcessingFacade.java`: Facade class.
- `FacadeTest.java`: Tests the facade pattern.

### Code Highlights
- `OrderProcessingFacade` encapsulates subsystem calls in a single `placeOrder` method.
- Subsystems simulate inventory checks, payment processing, and shipping.
- The test places two orders with different parameters.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `Facade_Cycle2_OrderProcessing`).
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java FacadeTest
     ```

3. **Expected Output**:
   ```
   Checking stock for Laptop: 2 available
   Reserving 2 of Laptop
   Processing payment of $2000.0 via Credit Card
   Scheduling delivery of Laptop to 123 Main St
   Order placed successfully
   Checking stock for Phone: 1 available
   Reserving 1 of Phone
   Processing payment of $800.0 via PayPal
   Scheduling delivery of Phone to 456 Oak Ave
   Order placed successfully
   ```

## Use Cases
- Simplifying APIs for complex libraries or frameworks.
- Coordinating e-commerce order workflows.
- Providing high-level interfaces for legacy systems.

## Examples in Java and Spring Boot
- **Java**:
  - **JDBC Facade**: The `java.sql.DriverManager` acts as a facade, simplifying database connection management by hiding driver-specific details.
  - **JavaMail API**: The `javax.mail.Session` provides a facade for email configuration and transport.
- **Spring Boot**:
  - **Spring Data JPA**: The `CrudRepository` interface is a facade, abstracting complex JPA operations into simple CRUD methods.
  - **RestTemplate**: Spring’s `RestTemplate` simplifies HTTP requests, hiding underlying connection and serialization details.
  - **Spring Boot Actuator**: The `/actuator` endpoints provide a facade for monitoring and managing application health, metrics, and configuration.

## Advantages
- Simplifies client code.
- Reduces subsystem coupling.
- Improves maintainability of complex systems.

## Disadvantages
- May become a "god object" if overused.
- Hides subsystem details, potentially limiting flexibility.
- Adds an extra layer of abstraction.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Data JPA: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/