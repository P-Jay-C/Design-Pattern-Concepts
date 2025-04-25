# Facade Pattern

## Overview
The **Facade Pattern** is a **Structural** design pattern that provides a simplified interface to a complex subsystem. It hides the complexities of the subsystem by offering a single, unified interface for clients to interact with.

## Purpose
- Simplify interaction with a complex subsystem.
- Reduce coupling between clients and subsystem components.
- Provide a higher-level interface for ease of use.

## Practice Task
**Task**: Implement a Facade pattern for a `HomeTheaterFacade` that simplifies the control of a home theater system with components like `DVDPlayer`, `Projector`, and `SoundSystem`. Create methods for `watchMovie()` and `endMovie()` in the facade to coordinate the components. Test by watching and ending a movie.

## Structure
- **Facade**: A class that provides simplified methods to interact with the subsystem (e.g., `HomeTheaterFacade`).
- **Subsystem**: A set of classes that perform specific tasks (e.g., `DVDPlayer`, `Projector`, `SoundSystem`).
- **Client**: Uses the facade to access the subsystem functionality.

## Implementation
The provided Java implementation fulfills the practice task by:
- Implementing subsystem components (`DVDPlayer`, `Projector`, `SoundSystem`) with basic functionality.
- Creating `HomeTheaterFacade` to coordinate the subsystem for watching and ending a movie.
- Including `FacadeTest.java` to demonstrate using the facade.

### Files
- `DVDPlayer.java`, `Projector.java`, `SoundSystem.java`: Subsystem components.
- `HomeTheaterFacade.java`: Facade class.
- `FacadeTest.java`: Tests the facade pattern.

### Code Highlights
- `HomeTheaterFacade` encapsulates the complexity of coordinating multiple subsystem components.
- `watchMovie()` and `endMovie()` methods provide a simple interface to start and stop a movie.
- The test demonstrates watching and ending a movie using the facade.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files (`DVDPlayer.java`, `Projector.java`, `SoundSystem.java`, `HomeTheaterFacade.java`, `FacadeTest.java`) into a Java project.
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java FacadeTest
     ```

3. **Expected Output**:
   ```
   Preparing to watch movie...
   Projector on
   Projector set to input: DVD
   Sound System on
   Sound System volume set to 5
   DVD Player on
   Playing movie: Inception
   Shutting down movie...
   DVD Player off
   Projector off
   Sound System off
   ```

## Use Cases
- Simplifying complex APIs (e.g., multimedia systems).
- Providing a unified interface for legacy systems.
- Streamlining client interaction with multiple services.

## Advantages
- Reduces client-subsystem coupling.
- Simplifies usage with a high-level interface.
- Improves maintainability by centralizing subsystem access.

## Disadvantages
- May become a "god object" if too many responsibilities are added.
- Does not add new functionality, only simplifies access.
- Can hide subsystem details needed for advanced use cases.

##交往 Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Classes: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html