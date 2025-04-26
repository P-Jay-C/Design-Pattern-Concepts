# Builder Pattern

## Overview
The **Builder Pattern** is a **Creational** design pattern that separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It is ideal for objects with many optional fields or complex initialization.

## Purpose
- Simplify object creation with many optional parameters.
- Ensure immutability of the constructed object.
- Provide a fluent interface for object configuration.

## Practice Task
**Task**: Implement a Builder pattern for a `Computer` class with attributes like `CPU`, `RAM`, `Storage`, and optional `GPU`. Create a `ComputerBuilder` to construct `Computer` objects with required and optional fields. Test by building computers with different configurations (e.g., one with GPU, one without).

## Structure
- **Product**: The complex object to be built (e.g., `Computer`).
- **Builder**: A class (often nested) that constructs the product step-by-step (e.g., `ComputerBuilder`).
- **Client**: Uses the builder to configure and create the product.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Computer` with immutable fields (`CPU`, `RAM`, `storage`, `GPU`).
- Implementing `ComputerBuilder` as a nested static class with methods to set optional fields.
- Including `BuilderTest.java` to demonstrate building two computers with different configurations.

### Files
- `Computer.java`: Contains the `Computer` class and its `ComputerBuilder`.
- `BuilderTest.java`: Tests building computers with varying configurations.

### Code Highlights
- `ComputerBuilder` enforces required fields (`CPU`, `RAM`) in its constructor and provides optional setters for `storage` and `GPU`.
- The `build()` method creates an immutable `Computer` object.
- The test creates a basic computer (no GPU) and a gaming computer (with GPU).

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `Computer.java` and `BuilderTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac Computer.java BuilderTest.java
     ```
   - Run the test:
     ```bash
     java BuilderTest
     ```

3. **Expected Output**:
   ```
   Basic Computer: Computer [CPU=Intel i5, RAM=8GB, Storage=256GB, GPU=None]
   Gaming Computer: Computer [CPU=AMD Ryzen 9, RAM=32GB, Storage=1000GB, GPU=NVIDIA RTX 3080]
   ```

## Use Cases
- Creating complex objects like configuration settings or DTOs.
- Building immutable objects with many optional fields (e.g., in Spring Boot applications).
- Simplifying object creation in APIs or libraries.

## Advantages
- Improves readability with a fluent interface.
- Supports immutability by setting fields only during construction.
- Reduces constructor overloading for optional parameters.

## Disadvantages
- Increases code verbosity with additional builder class.
- Requires maintenance of builder alongside the product class.
- May be overkill for simple objects with few fields.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Nested Classes: https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html