# Bridge Pattern

## Overview
The **Bridge Pattern** is a **Structural** design pattern that decouples an abstraction from its implementation, allowing the two to vary independently. It is useful when you want to separate interface hierarchies from their implementations.

## Purpose
- Decouple abstraction from implementation.
- Allow independent evolution of interfaces and implementations.
- Improve extensibility by avoiding tight coupling.

## Practice Task
**Task**: Implement a Bridge pattern for a `Device` system with devices (`TV`, `Radio`) and remotes (`BasicRemote`, `AdvancedRemote`). Create a `Device` interface and a `Remote` abstraction, with concrete implementations. Test by controlling a `TV` with both remotes and a `Radio` with a basic remote.

## Structure
- **Abstraction**: Defines the high-level interface (e.g., `Remote`).
- **Refined Abstraction**: Extends the abstraction with additional features (e.g., `BasicRemote`, `AdvancedRemote`).
- **Implementor**: An interface for implementation classes (e.g., `Device`).
- **Concrete Implementor**: Provides specific implementations (e.g., `TV`, `Radio`).
- **Client**: Uses the abstraction to interact with implementations.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Device` as an interface for devices.
- Implementing `TV` and `Radio` as concrete devices.
- Creating `Remote` as an abstract class for remotes.
- Implementing `BasicRemote` and `AdvancedRemote` for different control features.
- Including `BridgeTest.java` to demonstrate controlling devices with remotes.

### Files
- `Device.java`: Interface for devices.
- `TV.java`, `Radio.java`: Concrete device implementations.
- `Remote.java`: Abstract remote class.
- `BasicRemote.java`, `AdvancedRemote.java`: Concrete remote implementations.
- `BridgeTest.java`: Tests the bridge pattern.

### Code Highlights
- `Remote` holds a reference to a `Device` and delegates operations.
- `BasicRemote` provides basic controls (power, volume, mute).
- `AdvancedRemote` adds advanced features (e.g., channel control).
- The test controls a `TV` with both remotes and a `Radio` with a basic remote.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `Device.java`, `TV.java`, `Radio.java`, `Remote.java`, `BasicRemote.java`, `AdvancedRemote.java`, and `BridgeTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac Device.java TV.java Radio.java Remote.java BasicRemote.java AdvancedRemote.java BridgeTest.java
     ```
   - Run the test:
     ```bash
     java BridgeTest
     ```

3. **Expected Output**:
   ```
   TV turned on
   TV volume set to: 10
   TV volume set to: 0
   TV turned on
   Channel up (Advanced feature)
   Radio turned on
   Radio volume set to: 10
   ```

## Use Cases
- Supporting multiple platforms with different implementations (e.g., UI rendering).
- Managing devices with varying control interfaces.
- Decoupling business logic from data access layers (e.g., in Spring Boot).

## Advantages
- Decouples abstraction from implementation.
- Supports independent extension of abstractions and implementations.
- Improves code maintainability and flexibility.

## Disadvantages
- Increases complexity with additional classes and interfaces.
- May obscure the relationship between abstraction and implementation.
- Requires careful design to avoid over-engineering.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Abstract Classes: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html