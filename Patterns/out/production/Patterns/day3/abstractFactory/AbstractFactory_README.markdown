# Abstract Factory Pattern

## Overview
The **Abstract Factory Pattern** is a **Creational** design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is useful when a system needs to create multiple related objects that belong to a specific family (e.g., UI components for different themes).

## Purpose
- Create families of related objects without specifying concrete classes.
- Ensure consistency among products created by a factory.
- Support switching between families of products easily.

## Practice Task
**Task**: Implement an Abstract Factory for a `FurnitureFactory` that creates different types of furniture (`Chair`, `Table`) for different styles (`Modern`, `Victorian`). Create interfaces for `Chair` and `Table`, concrete classes for each style, and factories for `ModernFurnitureFactory` and `VictorianFurnitureFactory`. Test by creating furniture sets for both styles.

## Structure
- **Abstract Factory**: An interface or abstract class declaring methods to create abstract products (e.g., `FurnitureFactory`).
- **Concrete Factory**: Implements the abstract factory to create concrete products for a specific family (e.g., `ModernFurnitureFactory`, `VictorianFurnitureFactory`).
- **Abstract Product**: Interfaces for product types (e.g., `Chair`, `Table`).
- **Concrete Product**: Classes implementing the product interfaces (e.g., `ModernChair`, `VictorianTable`).
- **Client**: Uses the abstract factory to create products.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Chair` and `Table` as product interfaces.
- Implementing concrete products (`ModernChair`, `ModernTable`, `VictorianChair`, `VictorianTable`).
- Creating `FurnitureFactory` as the abstract factory interface.
- Implementing `ModernFurnitureFactory` and `VictorianFurnitureFactory` to create respective furniture.
- Including `AbstractFactoryTest.java` to demonstrate creating and using furniture sets.

### Files
- `Chair.java`, `Table.java`: Product interfaces.
- `ModernChair.java`, `ModernTable.java`, `VictorianChair.java`, `VictorianTable.java`: Concrete products.
- `FurnitureFactory.java`: Abstract factory interface.
- `ModernFurnitureFactory.java`, `VictorianFurnitureFactory.java`: Concrete factories.
- `AbstractFactoryTest.java`: Tests the abstract factory pattern.

### Code Highlights
- `FurnitureFactory` defines methods to create `Chair` and `Table`.
- `ModernFurnitureFactory` and `VictorianFurnitureFactory` produce consistent furniture styles.
- The test creates furniture sets for both Modern and Victorian styles and demonstrates their use.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files (`Chair.java`, `Table.java`, `ModernChair.java`, `ModernTable.java`, `VictorianChair.java`, `VictorianTable.java`, `FurnitureFactory.java`, `ModernFurnitureFactory.java`, `VictorianFurnitureFactory.java`, `AbstractFactoryTest.java`) into a Java project.
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java AbstractFactoryTest
     ```

3. **Expected Output**:
   ```
   Sitting on a Modern Chair
   Placing item on a Modern Table
   Sitting on a Victorian Chair
   Placing item on a Victorian Table
   ```

## Use Cases
- Creating UI components for different themes (e.g., Windows, macOS).
- Producing related objects for different product families (e.g., furniture styles).
- Supporting multiple configurations in a system (e.g., database drivers).

## Advantages
- Ensures consistency among products in a family.
- Promotes loose coupling by abstracting creation.
- Simplifies adding new product families.

## Disadvantages
- Increases complexity with many classes and interfaces.
- Adding new product types requires modifying all factories.
- Can be overkill for simple systems.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Interfaces: https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html