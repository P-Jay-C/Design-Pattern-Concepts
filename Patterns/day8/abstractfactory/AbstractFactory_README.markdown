# Abstract Factory Pattern

## Overview
The **Abstract Factory Pattern** is a **Creational** design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It ensures consistency among products created together, ideal for systems requiring interchangeable object sets.

## Purpose
- Create families of related objects with consistent interfaces.
- Support multiple product variants (e.g., for different platforms).
- Decouple client code from concrete implementations.

## Practice Task
**Task**: Implement an Abstract Factory pattern for a `UIFactory` that creates UI components (`Button`, `TextField`) for different operating systems (Windows, macOS). Create an abstract factory interface and concrete factories for each OS. Test by creating and rendering components for both Windows and macOS.

## Structure
- **Abstract Factory**: An interface declaring methods to create abstract products (e.g., `UIFactory`).
- **Concrete Factory**: Implements the factory to create concrete products (e.g., `WindowsUIFactory`, `MacOSUIFactory`).
- **Abstract Product**: Interfaces for product types (e.g., `Button`, `TextField`).
- **Concrete Product**: Classes implementing the product interfaces (e.g., `WindowsButton`, `MacOSButton`).
- **Client**: Uses the factory to create and interact with products.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Button` and `TextField` as abstract product interfaces.
- Implementing concrete products (`WindowsButton`, `MacOSButton`, etc.).
- Creating `UIFactory` as the abstract factory interface.
- Implementing `WindowsUIFactory` and `MacOSUIFactory` for OS-specific components.
- Including `AbstractFactoryTest.java` to test component creation.

### Files
- `Button.java`, `TextField.java`: Product interfaces.
- `WindowsButton.java`, `WindowsTextField.java`, `MacOSButton.java`, `MacOSTextField.java`: Concrete products.
- `UIFactory.java`: Abstract factory interface.
- `WindowsUIFactory.java`, `MacOSUIFactory.java`: Concrete factories.
- `AbstractFactoryTest.java`: Tests the abstract factory pattern.

### Code Highlights
- `UIFactory` defines methods to create `Button` and `TextField`.
- `WindowsUIFactory` and `MacOSUIFactory` produce OS-specific components.
- The test creates and renders components for both Windows and macOS.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `AbstractFactory_Cycle2_UI`).
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
   Rendering Windows Button
   Rendering Windows TextField
   Rendering macOS Button
   Rendering macOS TextField
   ```

## Use Cases
- Creating platform-specific UI components (e.g., desktop or mobile apps).
- Supporting multiple database drivers in a data access layer.
- Managing themed resources in applications (e.g., light/dark themes).

## Examples in Java and Spring Boot
- **Java**:
  - **Toolkit in AWT**: The `java.awt.Toolkit` class is an abstract factory, creating platform-specific peers for UI components (e.g., buttons, windows) based on the operating system.
  - **DocumentBuilderFactory**: In `javax.xml.parsers`, `DocumentBuilderFactory` creates XML parsers for different configurations, abstracting the parser implementation.
- **Spring Boot**:
  - **DataSource Configuration**: Spring Boot’s `DataSourceAutoConfiguration` acts as an abstract factory, creating `DataSource` beans (e.g., HikariCP, Tomcat) based on application properties or classpath dependencies.
  - **MessageConverter Factories**: Spring’s `HttpMessageConverter` system uses factories to create converters for different content types (e.g., JSON, XML), ensuring consistent serialization/deserialization.
  - **Spring Cloud Connectors**: In Spring Cloud, connectors provide factories to create cloud-specific services (e.g., AWS, GCP), abstracting service instantiation.

## Advantages
- Ensures consistency among related products.
- Supports interchangeability of product families.
- Follows the Open/Closed Principle for extensibility.

## Disadvantages
- Increases complexity with multiple interfaces and classes.
- Adding new products requires updating all factories.
- Can be overkill for simple object creation.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Boot Auto-Configuration: https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.auto-configuration