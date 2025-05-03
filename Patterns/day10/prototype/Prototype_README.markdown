# Prototype Pattern

## Overview
The **Prototype Pattern** is a **Creational** design pattern that creates new objects by copying an existing object, known as the prototype. It is useful when object creation is costly or complex, and instances need to be customized after cloning.

## Purpose
- Avoid expensive object initialization.
- Support deep or shallow copying of objects.
- Enable flexible object creation via a registry.

## Practice Task
**Task**: Implement a Prototype pattern for a `Report` system that clones report templates (e.g., `FinancialReport`, `SalesReport`) with customizable titles and data. Create a `Report` interface with a `clone` method, concrete report classes, and a `ReportRegistry` to manage prototypes. Test by cloning and customizing reports.

## Structure
- **Prototype**: An interface or class with a clone method (e.g., `Report`).
- **Concrete Prototype**: Classes implementing the clone method (e.g., `FinancialReport`, `SalesReport`).
- **Registry**: Manages a collection of prototypes (e.g., `ReportRegistry`).
- **Client**: Uses the registry to clone and customize prototypes.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Report` as the prototype interface with `clone` and customization methods.
- Implementing `FinancialReport` and `SalesReport` with shallow cloning.
- Creating `ReportRegistry` to store and retrieve prototypes.
- Including `PrototypeTest.java` to test cloning and customization.

### Files
- `Report.java`: Prototype interface.
- `FinancialReport.java`, `SalesReport.java`: Concrete prototypes.
- `ReportRegistry.java`: Prototype registry.
- `PrototypeTest.java`: Tests the prototype pattern.

### Code Highlights
- `Report` extends `Cloneable` and defines a `clone` method.
- `FinancialReport` and `SalesReport` use Java’s `Object.clone()` for shallow copying.
- `ReportRegistry` uses a `HashMap` to manage prototypes.
- The test clones reports and customizes their titles and data.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `Prototype_Cycle2_Report`).
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java PrototypeTest
     ```

3. **Expected Output**:
   ```
   Report: Q1 Financials, Data: Revenue: $1M
   Report: Q2 Financials, Data: Revenue: $1.2M
   Report: Annual Sales, Data: Units Sold: 500
   ```

## Use Cases
- Cloning complex objects like templates or configurations.
- Managing reusable prototypes in design tools or games.
- Optimizing object creation in performance-critical systems.

## Examples in Java and Spring Boot
- **Java**:
  - **Cloneable Interface**: Java’s `Cloneable` interface and `Object.clone()` support the Prototype pattern, used in classes like `ArrayList` for shallow copying.
  - **Prototype in Serialization**: Deep copying via serialization (e.g., `ObjectOutputStream`) acts as a prototype mechanism.
- **Spring Boot**:
  - **Bean Prototypes**: Spring’s `prototype` scope creates new bean instances on each request, similar to cloning a prototype.
  - **Configuration Templates**: Spring’s `PropertySource` can be cloned to create environment-specific configurations.
  - **Spring Data Projections**: Spring Data JPA projections create lightweight copies of entities, resembling prototype-based customization.

## Advantages
- Reduces object creation overhead.
- Supports flexible customization post-cloning.
- Simplifies prototype management via a registry.

## Disadvantages
- Cloning can be complex for deep copies.
- Requires careful handling of `CloneNotSupportedException`.
- May lead to unexpected behavior with mutable state.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Bean Scopes: https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-scopes