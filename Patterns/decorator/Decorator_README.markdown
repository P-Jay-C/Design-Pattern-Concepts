# Decorator Pattern

## Overview
The **Decorator Pattern** is a **Structural** design pattern that allows behavior to be added to an object dynamically by wrapping it with additional classes. It provides a flexible alternative to subclassing for extending functionality.

## Purpose
- Add responsibilities to objects transparently.
- Support dynamic behavior composition.
- Avoid rigid inheritance hierarchies.

## Practice Task
**Task**: Implement a Decorator pattern for a `Notification` system that sends messages via different channels (e.g., Email, SMS). Create a `Notification` interface, a basic `SimpleNotification`, and decorators to add channels. Test by sending notifications with single and combined channels.

## Structure
- **Component**: An interface or abstract class defining the core behavior (e.g., `Notification`).
- **Concrete Component**: The base object to be decorated (e.g., `SimpleNotification`).
- **Decorator**: An abstract class implementing the component interface and holding a reference to a component (e.g., `NotificationDecorator`).
- **Concrete Decorator**: Adds specific behavior (e.g., `EmailNotificationDecorator`, `SMSNotificationDecorator`).
- **Client**: Configures the decorator chain.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Notification` as the component interface.
- Implementing `SimpleNotification` as the base component.
- Creating `NotificationDecorator` as the abstract decorator.
- Implementing `EmailNotificationDecorator` and `SMSNotificationDecorator` for additional channels.
- Including `DecoratorTest.java` to test notification combinations.

### Files
- `Notification.java`: Component interface.
- `SimpleNotification.java`: Concrete component.
- `NotificationDecorator.java`: Abstract decorator.
- `EmailNotificationDecorator.java`, `SMSNotificationDecorator.java`: Concrete decorators.
- `DecoratorTest.java`: Tests the decorator pattern.

### Code Highlights
- `NotificationDecorator` delegates to the wrapped component.
- Concrete decorators add channel-specific behavior (Email, SMS).
- The test demonstrates single and stacked decorators.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `Decorator_Cycle2_Notification`).
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java DecoratorTest
     ```

3. **Expected Output**:
   ```
   Simple Notification:
   Base notification: Hello!

   Email Notification:
   Base notification: Hello!
   Sending via Email: Hello!

   Email + SMS Notification:
   Base notification: Hello!
   Sending via Email: Hello!
   Sending via SMS: Hello!
   ```

## Use Cases
- Adding features to UI components (e.g., borders, scrolling).
- Extending logging or monitoring capabilities.
- Enhancing communication channels in messaging systems.

## Examples in Java and Spring Boot
- **Java**:
  - **IO Streams**: Java’s `java.io` package uses decorators, e.g., `BufferedInputStream` decorates `FileInputStream` to add buffering.
  - **Collections**: `Collections.synchronizedList` wraps a `List` to add thread-safety, acting as a decorator.
- **Spring Boot**:
  - **Security Filters**: Spring Security’s filter chain uses decorators to add authentication, authorization, or CORS handling to HTTP requests.
  - **WebClient Decorators**: In Spring WebFlux, `WebClient` can be decorated with filters to add logging or retry logic.
  - **AOP Proxies**: Spring AOP uses decorators (via proxies) to add cross-cutting concerns like transaction management or logging.

## Advantages
- Flexible alternative to subclassing.
- Supports dynamic behavior addition/removal.
- Follows the Open/Closed Principle.

## Disadvantages
- Increases complexity with many small classes.
- Can lead to confusing object chains.
- Requires careful interface design.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Security: https://docs.spring.io/spring-security/reference/