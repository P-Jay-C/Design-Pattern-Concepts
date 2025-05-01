# Memento Pattern

## Overview
The **Memento Pattern** is a **Behavioral** design pattern that captures and externalizes an object’s internal state without violating encapsulation, allowing the object to be restored to that state later. It is ideal for implementing undo/redo functionality.

## Purpose
- Save and restore an object’s state.
- Support undo/redo operations.
- Maintain encapsulation of the object’s state.

## Practice Task
**Task**: Implement a Memento pattern for a `TextDocument` that supports saving and restoring its content. Create a `Memento` class to store state, a `TextDocument` as the originator, and a `History` caretaker to manage mementos. Test by editing the document, saving states, and restoring previous states.

## Structure
- **Memento**: Stores the state of the originator (e.g., `Memento`).
- **Originator**: Creates and restores mementos (e.g., `TextDocument`).
- **Caretaker**: Manages a collection of mementos (e.g., `History`).
- **Client**: Coordinates saving and restoring states.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Memento` to store document content.
- Implementing `TextDocument` to create and restore mementos.
- Creating `History` to manage mementos with undo/redo support.
- Including `MementoTest.java` to test saving and restoring states.

### Files
- `Memento.java`: Memento class for state storage.
- `TextDocument.java`: Originator class.
- `History.java`: Caretaker class.
- `MementoTest.java`: Tests the memento pattern.

### Code Highlights
- `Memento` encapsulates the document’s content immutably.
- `TextDocument` provides `save()` and `restore()` methods.
- `History` supports undo/redo by tracking memento indices.
- The test edits the document, saves states, and performs undo/redo.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `Memento_Cycle1_TextDocument`).
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java MementoTest
     ```

3. **Expected Output**:
   ```
   Current: Version 1
   Current: Version 2
   Current: Version 3
   Undo to: Version 2
   Undo to: Version 1
   Redo to: Version 2
   ```

## Use Cases
- Implementing undo/redo in text or graphic editors.
- Managing state history in workflow systems.
- Saving game progress or application states.

## Examples in Java and Spring Boot
- **Java**:
  - **Serializable Objects**: Java’s `java.io.Serializable` interface allows objects to save their state (similar to a memento) for persistence, which can be restored later.
  - **UndoManager**: In `javax.swing.undo`, `UndoManager` acts as a caretaker, managing mementos for undoable edits in Swing applications.
- **Spring Boot**:
  - **Session Management**: Spring Session uses a memento-like approach to save and restore user session state across requests, storing state in a backend (e.g., Redis).
  - **Transactional Rollback**: Spring’s `@Transactional` annotation saves database state implicitly (like a memento) to rollback changes on failure, managed by the transaction manager.
  - **Spring Batch Checkpoints**: Spring Batch uses mementos to save job execution state, allowing jobs to resume from checkpoints after failures.

## Advantages
- Enables undo/redo without exposing internal state.
- Supports complex state management.
- Separates state storage from business logic.

## Disadvantages
- Increases memory usage for storing mementos.
- Adds complexity with additional classes.
- Requires careful management of memento lifecycle.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Session: https://docs.spring.io/spring-session/docs/current/reference/html5/