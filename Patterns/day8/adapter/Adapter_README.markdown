# Adapter Pattern

## Overview
The **Adapter Pattern** is a **Structural** design pattern that allows incompatible interfaces to work together by wrapping an existing class with a new interface. It acts as a bridge between two systems, enabling integration without modifying their code.

## Purpose
- Integrate legacy or third-party code with modern interfaces.
- Enable collaboration between classes with mismatched interfaces.
- Improve reusability of existing systems.

## Practice Task
**Task**: Implement an Adapter pattern to integrate a modern `EmailService` with a legacy `LegacyEmailSender` that uses a different interface. Create a `EmailService` interface, a `LegacyEmailSender` class, and an `EmailAdapter` to bridge them. Test by sending emails using the modern interface.

## Structure
- **Target**: The interface the client expects (e.g., `EmailService`).
- **Adaptee**: The existing class with an incompatible interface (e.g., `LegacyEmailSender`).
- **Adapter**: Implements the target interface and delegates to the adaptee (e.g., `EmailAdapter`).
- **Client**: Uses the target interface to interact with the adapter.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `EmailService` as the target interface.
- Implementing `LegacyEmailSender` as the adaptee with a different method signature.
- Creating `EmailAdapter` to adapt `LegacyEmailSender` to `EmailService`.
- Including `AdapterTest.java` to test email sending.

### Files
- `EmailService.java`: Target interface.
- `LegacyEmailSender.java`: Adaptee class.
- `EmailAdapter.java`: Adapter class.
- `AdapterTest.java`: Tests the adapter pattern.

### Code Highlights
- `EmailAdapter` translates `sendEmail` calls to the legacy `send` method.
- Combines subject and body into a single message for compatibility.
- The test sends two emails using the modern interface.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `Adapter_Cycle2_Email`).
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java AdapterTest
     ```

3. **Expected Output**:
   ```
   LegacyEmailSender: Sending to user@example.com: Subject: Meeting
   Let's meet at 2 PM.
   LegacyEmailSender: Sending to team@example.com: Subject: Update
   Project is on track.
   ```

## Use Cases
- Integrating legacy systems with modern APIs.
- Adapting third-party libraries to application interfaces.
- Supporting multiple data formats in a system.

## Examples in Java and Spring Boot
- **Java**:
  - **Collections Adapter**: `Collections.list(Enumeration)` adapts an `Enumeration` to a `List`, allowing legacy `Enumeration` objects to work with modern collection APIs.
  - **InputStreamReader**: In `java.io`, `InputStreamReader` adapts a byte-based `InputStream` to a character-based `Reader`.
- **Spring Boot**:
  - **HandlerAdapter in MVC**: Spring MVC’s `HandlerAdapter` interface adapts different controller types (e.g., `@Controller`, functional endpoints) to the `DispatcherServlet`, enabling unified request handling.
  - **JmsTemplate**: Spring’s `JmsTemplate` adapts JMS providers (e.g., ActiveMQ) to a simplified interface, abstracting provider-specific details.
  - **Spring Data Repositories**: Spring Data’s repository interfaces adapt database-specific operations (e.g., JPA, MongoDB) to a common CRUD interface.

## Advantages
- Enables integration of incompatible systems.
- Promotes reusability of existing code.
- Follows the Open/Closed Principle.

## Disadvantages
- Increases complexity with additional classes.
- May introduce performance overhead for simple integrations.
- Requires careful mapping of interfaces.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring MVC: https://docs.spring.io/spring-framework/docs/current/reference/html/web.html