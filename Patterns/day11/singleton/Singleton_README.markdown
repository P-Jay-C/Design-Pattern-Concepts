# Singleton Pattern

## Overview
The **Singleton Pattern** is a **Creational** design pattern that ensures a class has only one instance and provides a global point of access to it. It is useful for managing shared resources or centralized configurations.

## Purpose
- Ensure a single instance of a class.
- Provide global access to the instance.
- Support thread-safe initialization.

## Practice Task
**Task**: Implement a Singleton pattern for a `ConfigurationManager` that manages application settings (e.g., API keys, timeouts). Ensure thread-safe lazy initialization and provide methods to get/set settings. Test by accessing the singleton from multiple threads and updating settings.

## Structure
- **Singleton**: A class with a private constructor, a static instance, and a static method to access it (e.g., `ConfigurationManager`).
- **Client**: Uses the singleton to access or modify its state.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `ConfigurationManager` with a thread-safe double-checked locking singleton.
- Using a `HashMap` to store settings (e.g., API key, timeout).
- Including `SingletonTest.java` to test thread-safe access and updates.

### Files
- `ConfigurationManager.java`: Singleton class.
- `SingletonTest.java`: Tests the singleton pattern.

### Code Highlights
- `ConfigurationManager` uses `volatile` and double-checked locking for thread safety.
- Private constructor prevents direct instantiation.
- `getInstance` ensures a single instance.
- The test spawns threads to access the singleton and updates settings.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `ConfigurationManager.java` and `SingletonTest.java` into a Java project under a directory (e.g., `Singleton_Cycle3_Configuration`).
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java SingletonTest
     ```

3. **Expected Output** (thread order may vary):
   ```
   Thread-1: API Key = default-key
   Thread-2: API Key = default-key
   Main Thread: Updated API Key = new-key-123
   Main Thread: Timeout = 5000
   ```

## Use Cases
- Managing application configurations or settings.
- Controlling access to shared resources (e.g., database connections).
- Implementing logging or caching systems.

## Examples in Java and Spring Boot
- **Java**:
  - **Runtime**: `java.lang.Runtime.getRuntime()` provides a singleton for accessing system resources.
  - **Desktop**: `java.awt.Desktop.getDesktop()` returns a singleton for desktop interactions.
- **Spring Boot**:
  - **Spring Beans**: By default, Spring manages beans as singletons using the `@Bean` annotation with `@Scope("singleton")`.
  - **ApplicationContext**: Spring’s `ApplicationContext` is a singleton, providing access to beans and configuration.
  - **Environment**: Spring’s `Environment` bean acts as a singleton for accessing application properties.

## Advantages
- Ensures a single instance.
- Provides global access.
- Supports lazy initialization.

## Disadvantages
- Can complicate unit testing (e.g., mocking).
- May introduce global state issues.
- Thread-safety requires careful implementation.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Bean Scopes: https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-scopes