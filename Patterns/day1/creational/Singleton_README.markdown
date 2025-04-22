# Singleton Pattern

## Overview

The **Singleton Pattern** is a **Creational** design pattern that ensures a class has only one instance and provides a global point of access to it. This is useful when exactly one object is needed to coordinate actions across the system, such as a logger, configuration manager, or database connection pool.

## Purpose

- Restrict instantiation of a class to a single instance.
- Provide a global access point to that instance.
- Ensure thread-safety in multi-threaded environments.

## Practice Task

**Task**: Implement a Singleton class for a Logger that logs messages to a file. Ensure only one instance of the Logger exists, and provide a method to access it globally. Test it by trying to create multiple instances and verifying they refer to the same object.

## Structure

- **Private Static Instance**: Holds the single instance of the class.
- **Private Constructor**: Prevents direct instantiation from outside the class.
- **Public Static Method**: Provides access to the single instance, creating it if it doesn't exist.
- **Thread-Safety Mechanism**: Uses synchronization (e.g., double-checked locking) to handle concurrent access.

## Implementation

The provided Java implementation fulfills the practice task by:

- Implementing `Logger.java` as a Singleton class that logs messages.
- Including `SingletonTest.java` to demonstrate that multiple calls to `getInstance()` return the same instance and to test logging functionality.

### Files

- `Logger.java`: Contains the Singleton implementation with a `log` method.
- `SingletonTest.java`: Tests that only one instance is created and logs messages.

### Code Highlights

- The `Logger` class uses double-checked locking for thread-safe instantiation.
- The `getInstance()` method ensures only one `Logger` object exists.
- The test verifies that multiple calls to `getInstance()` return the same object using reference equality (`==`).

## How to Run

1. **Prerequisites**:

   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:

   - Copy `Logger.java` and `SingletonTest.java` into a Java project.

   - Compile the files:

     ```bash
     javac Logger.java SingletonTest.java
     ```

   - Run the test:

     ```bash
     java SingletonTest
     ```

3. **Expected Output**:

   ```
   Log: Message from logger1
   Log: Message from logger2
   Same instance? true
   ```

## Use Cases

- Logging systems where a single logger instance is needed.
- Configuration managers to centralize application settings.
- Database connection pools to manage a single connection resource.

## Advantages

- Controlled access to the single instance.
- Reduces memory usage by avoiding multiple instances.
- Lazy initialization (instance created only when needed).

## Disadvantages

- Can introduce global state, making testing difficult.
- Thread-safety adds complexity.
- Hard to subclass or modify behavior.

## Further Reading

- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Oracle Java Documentation on Synchronization: https://docs.oracle.com/javase/tutorial/essential/concurrency/