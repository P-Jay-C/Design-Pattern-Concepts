# Command Pattern

## Overview
The **Command Pattern** is a **Behavioral** design pattern that encapsulates a request as an object, allowing for parameterization of clients with different requests, queuing or logging of requests, and support for undoable operations. It decouples the object that invokes the operation from the one that performs it, enabling flexible and extensible request handling.

## Purpose
- Encapsulate a request as a standalone object.
- Support undo/redo operations by storing command history.
- Enable queuing, logging, or scheduling of requests.
- Decouple the invoker of a request from the receiver that processes it.

## Practice Task
**Task**: Implement a Command pattern for a `TextEditor` that supports operations like `write` and `undo`. Create a `Command` interface, concrete commands (`WriteCommand`, `UndoCommand`), and an `Editor` to execute commands. Test by performing write and undo operations.

## Structure
- **Command**: An interface or abstract class declaring the method to execute the command (e.g., `Command` with `execute()`).
- **Concrete Command**: Classes that implement the command interface, defining the action and binding it to a receiver (e.g., `WriteCommand`, `UndoCommand`).
- **Receiver**: The object that performs the actual work when a command is executed (e.g., `TextEditor`).
- **Invoker**: The object responsible for triggering the command execution (e.g., the test class or a command manager).
- **Client**: Configures the commands and associates them with the receiver and invoker.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Command` as an interface with an `execute()` method.
- Implementing `TextEditor` as the receiver, managing content and a history stack for undo operations.
- Creating `WriteCommand` to append text to the editor and save the state.
- Creating `UndoCommand` to revert to the previous state.
- Including `CommandTest.java` to demonstrate writing text and undoing operations.

### Files
- `Command.java`: Interface for commands.
- `TextEditor.java`: Receiver that handles write and undo operations.
- `WriteCommand.java`: Concrete command to write text.
- `UndoCommand.java`: Concrete command to undo the last operation.
- `CommandTest.java`: Test class to execute write and undo commands.

### Code Highlights
- `TextEditor` uses a `StringBuilder` for content and a `Stack` to store history for undo functionality.
- `WriteCommand` saves the current state before appending new text.
- `UndoCommand` restores the previous state from the history stack.
- The test executes two write commands and two undo commands to show the pattern in action.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy the Java files (`Command.java`, `TextEditor.java`, `WriteCommand.java`, `UndoCommand.java`, `CommandTest.java`) into a Java project.
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java CommandTest
     ```

3. **Expected Output**:
   ```
   Content: Hello
   Content: Hello, World!
   Undo - Content: Hello
   Undo - Content: 
   ```

## Use Cases
- Implementing undo/redo functionality in text editors or graphic design software.
- Queuing tasks in job schedulers or command processors.
- Logging operations for auditing or debugging purposes.
- Supporting transactional systems where actions can be reversed.

## Advantages
- Enables undo/redo operations by maintaining command history.
- Decouples the invoker from the receiver, improving flexibility.
- Supports queuing, logging, or scheduling of commands.
- Facilitates extensibility by adding new command types.

## Disadvantages
- Increases complexity due to additional classes for each command.
- May require significant memory for storing command history in long-running applications.
- Can complicate debugging due to indirect execution paths.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Stack Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html