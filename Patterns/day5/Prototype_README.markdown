# Prototype Pattern

## Overview
The **Prototype Pattern** is a **Creational** design pattern that creates new objects by copying an existing object, known as the prototype. It is useful when object creation is costly or complex, and cloning is more efficient than instantiating new objects.

## Purpose
- Create new objects by cloning existing ones.
- Reduce the overhead of complex object initialization.
- Support deep copying to ensure independent object instances.

## Practice Task
**Task**: Implement a Prototype pattern for a `Shape` class with subclasses `Circle` and `Rectangle`. Create a `ShapeRegistry` to store and clone shapes. Test by cloning a `Circle` and a `Rectangle` from the registry and modifying their attributes (e.g., radius, width) to verify deep copying.

## Structure
- **Prototype**: An interface or abstract class declaring a clone method (e.g., `Shape`).
- **Concrete Prototype**: Classes that implement the clone method (e.g., `Circle`, `Rectangle`).
- **Registry**: A class that stores prototypes and provides clones (e.g., `ShapeRegistry`).
- **Client**: Requests clones from the registry and customizes them.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Shape` as an interface with `clone()`, `setAttribute()`, and `draw()` methods.
- Implementing `Circle` and `Rectangle` with deep cloning.
- Creating `ShapeRegistry` to store and retrieve shape prototypes.
- Including `PrototypeTest.java` to demonstrate cloning and modifying shapes.

### Files
- `Shape.java`: Interface for shapes.
- `Circle.java`, `Rectangle.java`: Concrete shape classes with cloning.
- `ShapeRegistry.java`: Registry for storing and cloning shapes.
- `PrototypeTest.java`: Tests cloning and attribute modification.

### Code Highlights
- `Shape` extends `Cloneable` and declares a `clone()` method.
- `Circle` and `Rectangle` implement deep copying in `clone()`.
- `ShapeRegistry` stores prototypes and returns clones.
- The test clones shapes, modifies attributes, and verifies independence.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `Shape.java`, `Circle.java`, `Rectangle.java`, `ShapeRegistry.java`, and `PrototypeTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac Shape.java Circle.java Rectangle.java ShapeRegistry.java PrototypeTest.java
     ```
   - Run the test:
     ```bash
     java PrototypeTest
     ```

3. **Expected Output**:
   ```
   Drawing Circle with radius: 15
   Drawing Circle with radius: 10
   Drawing Rectangle with width: 30, height: 10
   Drawing Rectangle with width: 20, height: 10
   ```

## Use Cases
- Creating objects with expensive initialization (e.g., database connections).
- Managing predefined object templates (e.g., UI components).
- Supporting object copying in graphics or game development.

## Advantages
- Reduces object creation overhead.
- Supports dynamic object creation via cloning.
- Simplifies managing multiple object types with a registry.

## Disadvantages
- Deep copying can be complex for objects with nested references.
- Requires careful implementation to ensure thread safety.
- May increase memory usage if many prototypes are stored.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Cloneable: https://docs.oracle.com/javase/8/docs/api/java/lang/Cloneable.html