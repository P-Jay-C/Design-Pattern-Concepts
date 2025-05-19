# Memento Pattern

## Overview
The **Memento Pattern** is a **Behavioral** design pattern that captures and externalizes an object’s state without exposing its internal structure, allowing restoration to that state later. It is ideal for implementing undo/redo functionality.

## Purpose
- Save and restore object states.
- Maintain encapsulation of state.
- Support undo/redo operations.

## Practice Task
**Task**: Implement a Memento pattern for a `GameState` class that saves and restores the state of a game (e.g., player score, level). Create a `Memento` class to store the state, a `GameState` originator, and a `GameCaretaker` to manage mementos. Test by saving and restoring game states.

## Structure
- **Originator**: The object whose state is saved/restored (e.g., `GameState`).
- **Memento**: Stores the originator’s state (e.g., `Memento`).
- **Caretaker**: Manages mementos (e.g., `GameCaretaker`).
- **Client**: Uses the originator and caretaker.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `GameState` as the originator with `save` and `restore` methods.
- Creating `Memento` as a static inner class to store score and level.
- Implementing `GameCaretaker` to manage a stack of mementos.
- Including `MementoTest.java` to test saving and undoing states.

### Files
- `GameState.java`: Originator with inner `Memento` class.
- `GameCaretaker.java`: Caretaker class.
- `MementoTest.java`: Tests the memento pattern.

### Code Highlights
- `GameState` creates and restores mementos.
- `Memento` encapsulates state with private accessors.
- `GameCaretaker` uses a `Stack` for undo functionality.
- The test saves multiple states and undoes them.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `Memento_Cycle2_Game`).
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
   GameState updated: Score=100, Level=1
   GameState updated: Score=200, Level=2
   GameState updated: Score=300, Level=3

   Undoing last state:
   GameState restored: Score=200, Level=2

   Undoing another state:
   GameState restored: Score=100, Level=1
   ```

## Use Cases
- Implementing undo/redo in games or editors.
- Saving checkpoints in workflows.
- Managing state in transactional systems.

## Examples in Java and Spring Boot
- **Java**:
  - **Memento in Serialization**: `java.io.Serializable` objects can be saved and restored, resembling mementos.
  - **UndoManager**: `javax.swing.undo.UndoManager` manages undoable edits.
- **Spring Boot**:
  - **Spring Batch Checkpoints**: Spring Batch uses checkpoints to save and restore job states.
  - **Session Management**: Spring Session saves and restores user session states.
  - **JPA Entity Snapshots**: Spring Data JPA’s dirty checking creates snapshots of entity states for change detection.

## Advantages
- Maintains encapsulation of state.
- Supports undo/redo functionality.
- Simplifies state management.

## Disadvantages
- Increases memory usage for storing mementos.
- Adds complexity with extra classes.
- Requires careful state restoration logic.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Batch: https://docs.spring.io/spring-batch/docs/current/reference/html/