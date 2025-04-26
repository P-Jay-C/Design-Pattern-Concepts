# Composite Pattern

## Overview
The **Composite Pattern** is a **Structural** design pattern that allows treating individual objects and compositions of objects uniformly. It is used to represent part-whole hierarchies, enabling clients to work with complex tree-like structures as if they were single objects.

## Purpose
- Enable uniform treatment of individual and composite objects.
- Represent hierarchical structures like trees.
- Simplify client code by abstracting the complexity of the hierarchy.

## Practice Task
**Task**: Implement a Composite pattern for a `FileSystem` that represents files and directories. Create a `Component` interface with a `showDetails()` method, a `File` class, and a `Directory` class that can contain other components. Test by creating a directory structure with files and directories and displaying details.

## Structure
- **Component**: An interface or abstract class defining operations for all objects (e.g., `Component` with `showDetails()`).
- **Leaf**: A class representing individual objects with no children (e.g., `File`).
- **Composite**: A class that contains other components and implements the component interface (e.g., `Directory`).
- **Client**: Interacts with components through the component interface.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Component` as an interface with a `showDetails()` method.
- Implementing `File` as a leaf node representing individual files.
- Implementing `Directory` as a composite that can contain files or other directories.
- Including `CompositeTest.java` to demonstrate a file system hierarchy.

### Files
- `Component.java`: Interface for file system components.
- `File.java`: Leaf class for individual files.
- `Directory.java`: Composite class for directories.
- `CompositeTest.java`: Tests the composite pattern with a file system structure.

### Code Highlights
- `Directory` maintains a list of `Component` objects (files or directories).
- `showDetails()` recursively displays the hierarchy of directories and files.
- The test creates a structure with a `Home` directory containing a file and a `Documents` directory with another file.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `Component.java`, `File.java`, `Directory.java`, and `CompositeTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac Component.java File.java Directory.java CompositeTest.java
     ```
   - Run the test:
     ```bash
     java CompositeTest
     ```

3. **Expected Output**:
   ```
   Directory: Home
   File: image.jpg
   Directory: Documents
   File: document.txt
   ```

## Use Cases
- Representing file systems or organizational hierarchies.
- Building GUI components with nested elements (e.g., panels containing buttons).
- Managing complex data structures like menus or graphs.

## Advantages
- Simplifies client code by treating leaves and composites uniformly.
- Supports recursive operations on hierarchical structures.
- Facilitates adding new component types.

## Disadvantages
- Can make the design overly general, complicating type-specific operations.
- Increases memory usage for storing composite structures.
- May require additional checks to distinguish leaves from composites.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Collections: https://docs.oracle.com/javase/8/docs/api/java/util/List.html