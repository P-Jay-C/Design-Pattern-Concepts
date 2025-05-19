# Composite Pattern

## Overview
The **Composite Pattern** is a **Structural** design pattern that composes objects into tree-like structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions uniformly.

## Purpose
- Represent hierarchical structures.
- Treat leaves and composites uniformly.
- Simplify client interaction with complex hierarchies.

## Practice Task
**Task**: Implement a Composite pattern for a `FileSystem` that represents files and directories. Create a `FileSystemComponent` interface, a `File` leaf class, and a `Directory` composite class that can contain other components. Test by building a file system hierarchy and displaying it.

## Structure
- **Component**: An interface for all objects in the hierarchy (e.g., `FileSystemComponent`).
- **Leaf**: Individual objects with no children (e.g., `File`).
- **Composite**: Objects that contain other components (e.g., `Directory`).
- **Client**: Manipulates the hierarchy via the component interface.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `FileSystemComponent` with a `display` method.
- Implementing `File` as a leaf.
- Creating `Directory` as a composite that holds other components.
- Including `CompositeTest.java` to test the hierarchy.

### Files
- `FileSystemComponent.java`: Component interface.
- `File.java`: Leaf class.
- `Directory.java`: Composite class.
- `CompositeTest.java`: Tests the composite pattern.

### Code Highlights
- `FileSystemComponent` defines the common `display` operation.
- `Directory` manages a list of components and delegates `display`.
- The test builds and displays a file system hierarchy.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `Composite_Cycle3_FileSystem`).
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java CompositeTest
     ```

3. **Expected Output**:
   ```
   Directory: root
   Directory: home
   Directory: docs
   File: file2.pdf
   File: file1.txt
   ```

## Use Cases
- Representing file systems or organizational hierarchies.
- Building UI component trees.
- Managing tasks with subtasks.

## Examples in Java and Spring Boot
- **Java**:
  - **Swing Components**: `javax.swing.JComponent` forms hierarchies with containers like `JPanel`.
  - **DOM Nodes**: `org.w3c.dom.Node` represents XML/HTML trees with elements and leaves.
- **Spring Boot**:
  - **Spring Security ACLs**: Spring Security’s ACLs use composite structures for permission hierarchies.
  - **Composite Beans**: Spring’s `@Configuration` classes can compose beans into hierarchies.
  - **Actuator Endpoints**: Spring Boot Actuator’s endpoint groups form composite structures.

## Advantages
- Simplifies client code with uniform treatment.
- Supports recursive structures.
- Easy to add new component types.

## Disadvantages
- May oversimplify complex hierarchies.
- Can complicate type-specific operations.
- Increases memory for large trees.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Security: https://docs.spring.io/spring-security/reference/