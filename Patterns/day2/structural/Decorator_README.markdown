# Decorator Pattern

## Overview

The **Decorator Pattern** is a **Structural** design pattern that attaches additional responsibilities to an object dynamically. It provides a flexible alternative to subclassing for extending functionality, allowing behaviors to be added or removed at runtime.

## Purpose

- Extend object behavior without modifying its code.
- Combine multiple behaviors dynamically.
- Follow the Open/Closed Principle by keeping classes open for extension but closed for modification.

## Practice Task

**Task**: Implement a Decorator pattern for a `Coffee` system. Create a `Coffee` interface with `cost()` and `description()` methods, a `SimpleCoffee` class, and decorators like `MilkDecorator` and `SugarDecorator` to add features. Test by combining decorators to create a coffee with milk and sugar.

## Structure

- **Component**: The interface or abstract class defining the object (e.g., `Coffee`).
- **Concrete Component**: The base object to be decorated (e.g., `SimpleCoffee`).
- **Decorator**: An abstract class implementing the component interface and containing a reference to a component (e.g., `CoffeeDecorator`).
- **Concrete Decorator**: Adds responsibilities to the component (e.g., `MilkDecorator`, `SugarDecorator`).

## Implementation

The provided Java implementation fulfills the practice task by:

- Defining `Coffee` as an interface with `cost()` and `description()` methods.
- Implementing `SimpleCoffee` as the base coffee.
- Creating `CoffeeDecorator` as an abstract decorator class.
- Implementing `MilkDecorator` and `SugarDecorator` to add milk and sugar.
- Including `DecoratorTest.java` to demonstrate combining decorators.

### Files

- `Coffee.java`: Interface for coffee objects.
- `SimpleCoffee.java`: Concrete coffee implementation.
- `CoffeeDecorator.java`: Abstract decorator class.
- `MilkDecorator.java`, `SugarDecorator.java`: Concrete decorators.
- `DecoratorTest.java`: Tests decorating a coffee.

### Code Highlights

- `CoffeeDecorator` wraps a `Coffee` object and delegates calls to it.
- `MilkDecorator` and `SugarDecorator` add cost and description modifications.
- The test shows a simple coffee, a coffee with milk, and a coffee with both milk and sugar.

## How to Run

1. **Prerequisites**:

   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:

   - Copy all Java files (`Coffee.java`, `SimpleCoffee.java`, `CoffeeDecorator.java`, `MilkDecorator.java`, `SugarDecorator.java`, `DecoratorTest.java`) into a Java project.

   - Compile the files:

     ```bash
     javac *.java
     ```

   - Run the test:

     ```bash
     java DecoratorTest
     ```

3. **Expected Output**:

   ```
   Simple Coffee $2.0
   Simple Coffee, Milk $2.5
   Simple Coffee, Milk, Sugar $2.7
   ```

## Use Cases

- Adding features to objects (e.g., customizing beverages or products).
- Extending stream classes (e.g., Java I/O streams).
- Dynamically modifying UI components.

## Advantages

- Flexible alternative to subclassing.
- Allows combining multiple behaviors at runtime.
- Promotes single responsibility by separating concerns.

## Disadvantages

- Can lead to many small classes, increasing complexity.
- Decorators can be hard to debug if deeply nested.
- Requires careful management of decorator order.

## Further Reading

- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Interfaces: https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html