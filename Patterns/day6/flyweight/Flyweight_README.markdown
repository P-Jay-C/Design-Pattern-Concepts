# Flyweight Pattern

## Overview
The **Flyweight Pattern** is a **Structural** design pattern that optimizes memory usage by sharing common data among multiple objects. It is particularly useful when a system has many objects with identical or similar properties, allowing shared (intrinsic) state to be stored once while unique (extrinsic) state is maintained separately. This reduces memory footprint and improves performance in applications with large object counts.

## Purpose
- Minimize memory usage by sharing intrinsic state across objects.
- Separate intrinsic (shared) and extrinsic (unique) state for efficient management.
- Enhance performance in systems with many similar objects.

## Intrinsic vs. Extrinsic State
- **Intrinsic State**:
    - Data that is shared across multiple objects and does not vary between instances.
    - Stored in the Flyweight object (e.g., `TreeType`) to avoid duplication.
    - In the forest simulation example:
        - **Species** (e.g., "Oak", "Pine") and **texture** (e.g., "Rough", "Smooth") are intrinsic because all trees of the same type (e.g., all Oak trees with Rough texture) share these properties.
        - These are stored in `TreeType` objects, which are reused via the `TreeFactory`.
    - Intrinsic state is typically immutable to ensure safe sharing across multiple contexts.

- **Extrinsic State**:
    - Data that is unique to each object and varies between instances.
    - Stored outside the Flyweight, often in a context object (e.g., `Tree`) or passed to methods.
    - In the forest simulation example:
        - **Position (x, y)** is extrinsic because each tree has a unique location in the forest.
        - Stored in the `Tree` class, which references a shared `TreeType` but maintains its own coordinates.
    - Extrinsic state is managed separately to keep Flyweight objects lightweight and reusable.

- **Why Separate?**:
    - By storing intrinsic state once in `TreeType` (e.g., one `TreeType` for all "Oak, Rough" trees), the pattern avoids redundant memory allocation.
    - Extrinsic state (x, y) is stored per `Tree`, allowing each tree to have unique attributes without duplicating shared data.
    - This separation enables the system to handle thousands of trees efficiently, as only the unique positions are stored per instance, while species and texture are shared.

## Practice Task
**Task**: Implement a Flyweight pattern for a `Tree` system in a forest simulation, where trees share common attributes (e.g., species, texture) but have unique positions (x, y). Create a `TreeFactory` to manage shared `TreeType` objects and a `Forest` to store trees. Test by adding multiple trees of different types and displaying them.

## Structure
- **Flyweight**: Stores intrinsic state and provides methods that use extrinsic state (e.g., `TreeType`).
- **Flyweight Factory**: Manages a pool of flyweight objects, creating or reusing them as needed (e.g., `TreeFactory`).
- **Context**: Stores extrinsic state and references a flyweight (e.g., `Tree`).
- **Client**: Maintains a collection of contexts and interacts with flyweights (e.g., `Forest`).

## Implementation
The provided Java implementation fulfills the practice task by:
- Implementing `TreeType` as the flyweight, storing intrinsic state (species, texture).
- Creating `TreeFactory` to manage a pool of `TreeType` instances, ensuring reuse.
- Implementing `Tree` as the context, storing extrinsic state (x, y) and referencing a `TreeType`.
- Creating `Forest` to manage a collection of trees and draw them.
- Including `FlyweightTest.java` to test adding trees with shared types and displaying them.

### Files
- `TreeType.java`: Flyweight class for shared tree attributes.
- `TreeFactory.java`: Factory for managing flyweight instances.
- `Tree.java`: Context class with extrinsic state.
- `Forest.java`: Client managing trees.
- `FlyweightTest.java`: Tests the flyweight pattern.

### Code Highlights
- `TreeFactory` uses a `HashMap` to store and reuse `TreeType` objects based on species and texture.
- `TreeType` defines the `draw` method, which accepts extrinsic state (x, y) to render a tree.
- `Tree` stores unique position data and delegates drawing to its `TreeType`.
- `Forest` manages a list of `Tree` objects, demonstrating efficient memory use.
- The test adds three trees (two Oaks, one Pine) and shows shared `TreeType` usage.

## How to Run
1. **Prerequisites**:
    - Java Development Kit (JDK) 8 or higher.
    - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
    - Copy `TreeType.java`, `TreeFactory.java`, `Tree.java`, `Forest.java`, and `FlyweightTest.java` into a Java project.
    - Compile the files:
      ```bash
      javac TreeType.java TreeFactory.java Tree.java Forest.java FlyweightTest.java
      ```
    - Run the test:
      ```bash
      java FlyweightTest
      ```

3. **Expected Output**:
   ```
   Drawing Oak tree with Rough at (1, 1)
   Drawing Oak tree with Rough at (2, 3)
   Drawing Pine tree with Smooth at (5, 4)
   ```

## Use Cases
- Rendering large numbers of similar objects in games (e.g., trees, sprites).
- Managing character styles in text editors (e.g., font and size shared across characters).
- Optimizing memory in systems with repetitive data (e.g., caching in Spring Boot).

## Examples in Java and Spring Boot
- **Java**:
    - **String Pool**: Java’s `String` class uses a flyweight-like approach via the string intern pool. Strings with the same content (intrinsic state) are shared, while their usage context (extrinsic state, e.g., variable references) varies. For example, `String s1 = "hello"; String s2 = "hello";` reuses the same `String` object from the pool.
    - **Integer Cache**: The `Integer` class caches instances for values between -128 and 127 (configurable). `Integer i1 = 100; Integer i2 = 100;` shares the same object, with the reference context as extrinsic state.
- **Spring Boot**:
    - **Bean Scopes with Prototype-like Flyweights**: In Spring, singleton-scoped beans act as shared flyweight-like objects, where the bean’s configuration (intrinsic state) is reused across the application, and runtime state (extrinsic, e.g., request-specific data) is managed separately via dependency injection.
    - **Caching with Caffeine or EhCache**: Spring’s caching abstractions (e.g., `@Cacheable`) use flyweight-like structures to store shared cache entries (intrinsic state, e.g., query results) while associating them with unique keys (extrinsic state, e.g., query parameters). This optimizes memory for frequently accessed data.
    - **Message Formatters**: Spring’s `MessageSource` for internationalization (i18n) uses a flyweight-like approach, where message templates (intrinsic) are shared, and locale or context-specific arguments (extrinsic) are applied during formatting.

## Advantages
- Significantly reduces memory usage by sharing intrinsic state.
- Improves performance in applications with large object counts.
- Simplifies management of shared data via a factory.

## Disadvantages
- Increases design complexity due to intrinsic/extrinsic state separation.
- Requires careful handling of shared flyweights in multithreaded environments.
- Managing extrinsic state can be cumbersome for complex systems.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Collections: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
- Spring Caching: https://docs.spring.io/spring-framework/docs/current/reference/html/integration.html#cache