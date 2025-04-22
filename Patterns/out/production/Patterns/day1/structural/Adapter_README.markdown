# Adapter Pattern

## Overview
The **Adapter Pattern** is a **Structural** design pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by wrapping an existing class (adaptee) with a new interface (target) that the client expects.

## Purpose
- Enable classes with incompatible interfaces to collaborate.
- Reuse existing code without modifying it.
- Provide a unified interface for different implementations.

## Practice Task
**Task**: Create an Adapter to make a legacy `OldPaymentSystem` (with a method `makePayment(amount)`) compatible with a new `PaymentProcessor` interface (expecting `processPayment(amount, currency)`). Write code to demonstrate the adapter in action.

## Structure
- **Target Interface**: The interface that the client expects (e.g., `PaymentProcessor`).
- **Adaptee**: The existing class with an incompatible interface (e.g., `OldPaymentSystem`).
- **Adapter**: A class that implements the target interface and wraps the adaptee, translating calls to the adaptee's methods.
- **Client**: The code that uses the target interface.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `PaymentProcessor.java` as the target interface.
- Implementing `OldPaymentSystem.java` as the legacy adaptee.
- Creating `PaymentAdapter.java` to adapt `OldPaymentSystem` to `PaymentProcessor`.
- Including `AdapterTest.java` to demonstrate the adapter processing payments.

### Files
- `PaymentProcessor.java`: Defines the `processPayment` method.
- `OldPaymentSystem.java`: Contains the legacy `makePayment` method.
- `PaymentAdapter.java`: Adapts `OldPaymentSystem` to `PaymentProcessor`.
- `AdapterTest.java`: Tests the adapter with sample payments.

### Code Highlights
- The `PaymentAdapter` implements `PaymentProcessor` and delegates calls to `OldPaymentSystem`.
- The adapter handles the additional `currency` parameter not supported by the legacy system.
- The test shows the adapter enabling the old system to process payments with the new interface.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `PaymentProcessor.java`, `OldPaymentSystem.java`, `PaymentAdapter.java`, and `AdapterTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac PaymentProcessor.java OldPaymentSystem.java PaymentAdapter.java AdapterTest.java
     ```
   - Run the test:
     ```bash
     java AdapterTest
     ```

3. **Expected Output**:
   ```
   Processing payment of $100.5 via OldPaymentSystem
   Adapted to process 100.5 in USD
   Processing payment of $200.75 via OldPaymentSystem
   Adapted to process 200.75 in EUR
   ```

## Use Cases
- Integrating legacy systems with modern APIs.
- Adapting third-party libraries to match application interfaces.
- Supporting multiple data formats (e.g., XML to JSON conversion).

## Advantages
- Promotes code reuse without modifying existing classes.
- Increases flexibility by allowing disparate systems to work together.
- Follows the Open/Closed Principle (extendable without modification).

## Disadvantages
- Adds complexity with an additional layer (adapter).
- May introduce performance overhead due to delegation.
- Requires careful design to handle all edge cases.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Interface Documentation: [https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Proxy.html](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Proxy.html)