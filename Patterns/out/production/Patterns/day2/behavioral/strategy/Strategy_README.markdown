# Strategy Pattern

## Overview
The **Strategy Pattern** is a **Behavioral** design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from the client that uses it.

## Purpose
- Enable selecting an algorithm at runtime.
- Encapsulate related algorithms in separate classes.
- Promote flexibility by decoupling algorithm implementation from usage.

## Practice Task
**Task**: Implement a Strategy pattern for a `PaymentProcessor` that supports different payment strategies (`CreditCard`, `PayPal`). Create a `PaymentStrategy` interface with a `pay(amount)` method, concrete strategy classes, and a `PaymentProcessor` that uses a strategy. Test by switching strategies at runtime.

## Structure
- **Strategy**: The interface defining the algorithm (e.g., `PaymentStrategy`).
- **Concrete Strategies**: Classes implementing the strategy interface (e.g., `CreditCard`, `PayPal`).
- **Context**: The class that uses a strategy and can switch between them (e.g., `PaymentProcessor`).
- **Client**: Configures the context with a strategy and triggers its behavior.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `PaymentStrategy` as an interface with a `pay()` method.
- Implementing `CreditCard` and `PayPal` as concrete strategies.
- Creating `PaymentProcessor` as the context that uses a strategy.
- Including `StrategyTest.java` to demonstrate switching strategies at runtime.

### Files
- `PaymentStrategy.java`: Interface for payment strategies.
- `CreditCard.java`, `PayPal.java`: Concrete strategy implementations.
- `PaymentProcessor.java`: Context that uses a strategy.
- `StrategyTest.java`: Tests switching strategies.

### Code Highlights
- `PaymentStrategy` defines the `pay()` method for all strategies.
- `PaymentProcessor` holds a reference to a strategy and allows changing it via `setStrategy()`.
- The test demonstrates paying with a credit card and then switching to PayPal.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files (`PaymentStrategy.java`, `CreditCard.java`, `PayPal.java`, `PaymentProcessor.java`, `StrategyTest.java`) into a Java project.
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java StrategyTest
     ```

3. **Expected Output**:
   ```
   Paid $100.0 using Credit Card
   Paid $200.0 using PayPal
   ```

## Use Cases
- Switching algorithms (e.g., sorting or compression methods).
- Implementing different behaviors (e.g., payment or authentication methods).
- Supporting multiple configurations in a system.

## Advantages
- Promotes loose coupling between context and strategies.
- Enables runtime algorithm selection.
- Simplifies adding new strategies.

## Disadvantages
- Increases the number of classes.
- Client must be aware of all strategies to choose one.
- May introduce overhead for simple scenarios.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Interfaces: [https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)