# Chain of Responsibility Pattern

## Overview
The **Chain of Responsibility Pattern** is a **Behavioral** design pattern that passes a request along a chain of handlers. Each handler decides whether to process the request or pass it to the next handler, allowing dynamic handling of requests.

## Purpose
- Decouple the sender of a request from its receivers.
- Allow multiple objects to handle a request dynamically.
- Support flexible request processing without predefined handlers.

## Practice Task
**Task**: Implement a Chain of Responsibility pattern for a `SupportRequest` system with handlers (`Level1Support`, `Level2Support`, `Level3Support`) for different request levels. Create a `Handler` interface and chain handlers to process requests based on severity (1–3). Test by sending requests with varying severity levels.

## Structure
- **Handler**: An interface or abstract class defining the handling method and a reference to the next handler (e.g., `Handler`).
- **Concrete Handler**: Classes that process specific requests or pass them along (e.g., `Level1Support`, `Level2Support`, `Level3Support`).
- **Client**: Initiates the request and configures the chain.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Handler` as an interface with `handleRequest()` and `setNext()`.
- Implementing `SupportHandler` as an abstract base class for handlers.
- Creating `Level1Support`, `Level2Support`, and `Level3Support` to handle severity levels 1, 2, and 3.
- Including `ChainOfResponsibilityTest.java` to test the chain with different severity levels.

### Files
- `Handler.java`: Interface for handlers.
- `SupportHandler.java`: Abstract base class for handlers.
- `Level1Support.java`, `Level2Support.java`, `Level3Support.java`: Concrete handlers.
- `ChainOfResponsibilityTest.java`: Tests the chain of responsibility pattern.

### Code Highlights
- `SupportHandler` provides default behavior to pass requests to the next handler.
- Each concrete handler processes requests matching its severity level or delegates to the next.
- The test sets up a chain and sends requests with severities 1, 2, 3, and 4 (unhandled).

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `Handler.java`, `SupportHandler.java`, `Level1Support.java`, `Level2Support.java`, `Level3Support.java`, and `ChainOfResponsibilityTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac Handler.java SupportHandler.java Level1Support.java Level2Support.java Level3Support.java ChainOfResponsibilityTest.java
     ```
   - Run the test:
     ```bash
     java ChainOfResponsibilityTest
     ```

3. **Expected Output**:
   ```
   Level 1 Support: Handling basic request
   Level 2 Support: Handling intermediate request
   Level 3 Support: Handling critical request
   ```

## Use Cases
- Handling events in GUI frameworks (e.g., event bubbling).
- Processing requests in support systems or workflows.
- Implementing logging or filtering pipelines (e.g., in Spring Boot).

## Advantages
- Decouples request senders from receivers.
- Supports dynamic handler chains.
- Simplifies adding new handlers.

## Disadvantages
- Requests may go unhandled if no handler matches.
- Can introduce performance overhead in long chains.
- Debugging complex chains can be challenging.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Interfaces: https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html