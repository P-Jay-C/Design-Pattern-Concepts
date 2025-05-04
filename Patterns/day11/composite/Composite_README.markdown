# Composite Pattern

## Overview
The **Composite Pattern** is a **Structural** design pattern that composes objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions uniformly.

## Purpose
- Represent hierarchical structures.
- Enable uniform treatment of individual and composite objects.
- Simplify client code for complex hierarchies.

## Practice Task
**Task**: Implement a Composite pattern for a `Task` system that represents individual tasks and task groups (e.g., projects). Create a `TaskComponent` interface, `Task` for individual tasks, and `TaskGroup` for composite tasks. Test by creating a project hierarchy and calculating total time.

## Structure
- **Component**: An interface for both leaf and composite objects (e.g., `TaskComponent`).
- **Leaf**: Individual objects with no children (e.g., `Task`).
- **Composite**: Objects that contain other components (e.g., `TaskGroup`).
- **Client**: Interacts with components via the interface.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `TaskComponent` with methods for name, time, and display.
- Implementing `Task` as a leaf with task details.
- Implementing `TaskGroup` as a composite to manage child tasks.
- Including `CompositeTest.java` to test the hierarchy.

### Files
- `TaskComponent.java`: Component interface.
- `Task.java`: Leaf class.
- `TaskGroup.java`: Composite class.
- `CompositeTest.java`: Tests the composite pattern.

### Code Highlights
- `TaskComponent` defines common operations (`getName`, `getTimeHours`, `display`).
- `TaskGroup` aggregates children and computes total time using streams.
- The test builds a project hierarchy and displays it.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `Composite_Cycle2_Task`).
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
   Group: Project, Total Time: 33 hours
   Group: Frontend, Total Time: 18 hours
   Task: Design UI, Time: 10 hours
   Task: Write Tests, Time: 8 hours
   Group: Backend, Total Time: 15 hours
   Task: Implement API, Time: 15 hours
   Total Project Time: 33 hours
   ```

## Use Cases
- Representing file systems or organizational structures.
- Managing UI component trees.
- Handling project or task hierarchies.

## Examples in Java and Spring Boot
- **Java**:
  - **Swing Components**: `javax.swing.JComponent` uses a composite structure, with containers like `JPanel` holding child components.
  - **DOM Tree**: The `org.w3c.dom` package represents XML/HTML documents as composite trees with nodes.
- **Spring Boot**:
  - **Spring MVC View Hierarchy**: Spring MVC’s view resolvers can handle composite views (e.g., Tiles), where a view contains subviews.
  - **Configuration Properties**: Spring’s `@ConfigurationProperties` can model nested configuration objects, resembling a composite structure.
  - **Spring Security Filter Chain**: The filter chain acts as a composite, with filters containing subfilters for security processing.

## Advantages
- Simplifies client code for hierarchies.
- Supports uniform treatment of objects.
- Facilitates tree-like structures.

## Disadvantages
- May overly generalize leaf and composite interfaces.
- Can complicate design for restricted hierarchies.
- Increases memory usage for deep trees.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring MVC Views: https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-view