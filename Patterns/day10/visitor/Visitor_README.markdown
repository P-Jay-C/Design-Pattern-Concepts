# Visitor Pattern

## Overview
The **Visitor Pattern** is a **Behavioral** design pattern that separates an algorithm from the object structure it operates on. It allows new operations to be added to objects without modifying their classes, ideal for processing complex object hierarchies.

## Purpose
- Add new operations without changing object classes.
- Centralize related behavior in visitor classes.
- Support double-dispatch for type-specific operations.

## Practice Task
**Task**: Implement a Visitor pattern for a `Document` system that processes different document elements (e.g., `TextElement`, `ImageElement`) for operations like rendering and exporting. Create a `Visitor` interface, concrete visitors, and element classes. Test by applying visitors to a document with mixed elements.

## Structure
- **Element**: An interface for objects accepting visitors (e.g., `DocumentElement`).
- **Concrete Element**: Classes implementing the element interface (e.g., `TextElement`, `ImageElement`).
- **Visitor**: An interface defining visit methods for each element type (e.g., `Visitor`).
- **Concrete Visitor**: Implements operations for elements (e.g., `RenderVisitor`, `ExportVisitor`).
- **Object Structure**: Manages elements and applies visitors (e.g., `Document`).

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `DocumentElement` as the element interface with an `accept` method.
- Implementing `TextElement` and `ImageElement` as concrete elements.
- Creating `Visitor` with visit methods for each element type.
- Implementing `RenderVisitor` and `ExportVisitor` for rendering and exporting.
- Including `VisitorTest.java` to test visitor operations.

### Files
- `DocumentElement.java`: Element interface.
- `TextElement.java`, `ImageElement.java`: Concrete elements.
- `Visitor.java`: Visitor interface.
- `RenderVisitor.java`, `ExportVisitor.java`: Concrete visitors.
- `Document.java`: Object structure.
- `VisitorTest.java`: Tests the visitor pattern.

### Code Highlights
- `DocumentElement` defines `accept` to dispatch visitors.
- `Visitor` includes type-specific `visit` methods.
- `Document` applies visitors to all elements.
- The test demonstrates rendering and exporting a mixed document.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `Visitor_Cycle1_Document`).
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java VisitorTest
     ```

3. **Expected Output**:
   ```
   Rendering document:
   Rendering text: Hello, World!
   Rendering image: logo.png
   Rendering text: Footer text

   Exporting document:
   Exporting text to markdown: Hello, World!
   Exporting image to base64: logo.png
   Exporting text to markdown: Footer text
   ```

## Use Cases
- Processing ASTs in compilers or interpreters.
- Rendering or exporting document structures.
- Analyzing hierarchical data in reporting systems.

## Examples in Java and Spring Boot
- **Java**:
  - **File System Traversal**: The `java.nio.file.FileVisitor` interface allows visiting file system nodes, applying operations like scanning or copying.
  - **Annotation Processing**: Java’s annotation processors use a visitor-like approach to traverse and process code elements.
- **Spring Boot**:
  - **Spring Expression Language (SpEL)**: SpEL uses a visitor pattern to evaluate expressions by traversing AST nodes.
  - **Spring Data Query Processing**: Spring Data’s query parsers apply visitor-like operations to process query criteria.
  - **Bean Validation**: Spring’s integration with Hibernate Validator uses visitors to traverse object graphs for validation rules.

## Advantages
- Adds operations without modifying element classes.
- Centralizes related behavior in visitors.
- Supports complex object structures.

## Disadvantages
- Increases complexity with new classes per operation.
- Requires updating visitors for new element types.
- May break encapsulation if elements expose internal state.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Expression Language: https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions