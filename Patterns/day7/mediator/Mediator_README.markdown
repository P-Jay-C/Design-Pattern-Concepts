# Mediator Pattern

## Overview
The **Mediator Pattern** is a **Behavioral** design pattern that defines an object that encapsulates how a set of objects interact, promoting loose coupling by preventing direct references between them. It centralizes communication, making it easier to manage complex interactions.

## Purpose
- Reduce direct dependencies between objects.
- Centralize communication logic in a mediator.
- Simplify maintenance of complex interaction patterns.

## Practice Task
**Task**: Implement a Mediator pattern for a `ChatRoom` system that coordinates messages between `User` objects. Create a `Mediator` interface, a `ChatRoomMediator` to manage communication, and a `User` class. Test by having multiple users send messages through the mediator.

## Structure
- **Mediator**: An interface or class defining communication methods (e.g., `Mediator`).
- **Concrete Mediator**: Implements the mediator to coordinate objects (e.g., `ChatRoomMediator`).
- **Colleague**: Objects that communicate via the mediator (e.g., `User`).
- **Client**: Sets up the mediator and colleagues.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Mediator` with a `sendMessage()` method.
- Implementing `ChatRoomMediator` to manage user communication.
- Creating `User` to send and receive messages via the mediator.
- Including `MediatorTest.java` to test message exchange.

### Files
- `Mediator.java`: Interface for mediators.
- `ChatRoomMediator.java`: Concrete mediator for chat room.
- `User.java`: Colleague class for users.
- `MediatorTest.java`: Tests the mediator pattern.

### Code Highlights
- `ChatRoomMediator` maintains a list of users and broadcasts messages.
- `User` sends messages through the mediator, avoiding direct references.
- The test sets up a chat room with three users and demonstrates messaging.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `Mediator.java`, `ChatRoomMediator.java`, `User.java`, and `MediatorTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac Mediator.java ChatRoomMediator.java User.java MediatorTest.java
     ```
   - Run the test:
     ```bash
     java MediatorTest
     ```

3. **Expected Output**:
   ```
   Alice sends: Hi everyone!
   Bob receives: Hi everyone!
   Charlie receives: Hi everyone!
   Bob sends: Hey Alice!
   Alice receives: Hey Alice!
   Charlie receives: Hey Alice!
   ```

## Use Cases
- Managing communication in chat applications or messaging systems.
- Coordinating UI components in complex interfaces.
- Handling interactions in event-driven systems.

## Examples in Java and Spring Boot
- **Java**:
  - **Event Dispatching**: Java’s AWT/Swing event handling uses a mediator-like approach. The `EventQueue` acts as a mediator, coordinating events between UI components (e.g., buttons, panels) without direct interaction.
  - **Mediator in Collections**: The `ExecutorService` in `java.util.concurrent` mediates task execution, decoupling task submitters from thread pool workers.
- **Spring Boot**:
  - **ApplicationEventPublisher**: Spring’s `ApplicationEventPublisher` acts as a mediator, allowing components to publish and listen to events without direct coupling. For example, a service can publish a `UserRegisteredEvent`, and listeners handle it independently.
  - **Message Brokers**: In Spring Messaging (e.g., with RabbitMQ or Kafka), the message broker serves as a mediator, coordinating communication between producers and consumers.
  - **Controller-Service Interaction**: Spring MVC controllers often act as mediators, coordinating requests between clients and services, reducing direct dependencies.

## Advantages
- Reduces coupling by centralizing communication.
- Simplifies maintenance of complex interactions.
- Supports dynamic addition of colleagues.

## Disadvantages
- Mediator can become a "god object" if overused.
- Increases complexity for simple interactions.
- May introduce performance bottlenecks in large systems.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Events: https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#context-functionality-events