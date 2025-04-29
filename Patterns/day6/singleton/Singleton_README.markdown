# Singleton Pattern

## Overview
The **Singleton Pattern** is a **Creational** design pattern that ensures a class has only one instance and provides a global point of access to it. It is useful for managing shared resources, such as database connections, where multiple instances could lead to resource conflicts or inefficiencies.

## Purpose
- Restrict instantiation to a single instance.
- Provide a global access point to the instance.
- Ensure thread-safety in concurrent environments.

## Practice Task
**Task**: Implement a Singleton pattern for a `DatabaseConnection` class that manages a single database connection instance. Ensure thread-safe instantiation and provide a method to execute a query. Test by accessing the instance from multiple threads to verify it’s the same instance and executing sample queries.

## Structure
- **Private Static Instance**: Holds the single instance of the class.
- **Private Constructor**: Prevents external instantiation.
- **Public Static Method**: Provides access to the instance, creating it if necessary.
- **Thread-Safety Mechanism**: Uses double-checked locking or other techniques for concurrent access.

## Implementation
The provided Java implementation fulfills the practice task by:
- Implementing `DatabaseConnection` as a Singleton with a thread-safe `getInstance()` method.
- Providing an `executeQuery()` method to simulate database operations.
- Including `SingletonTest.java` to test instance uniqueness across multiple threads.

### Files
- `DatabaseConnection.java`: Singleton class for database connection.
- `SingletonTest.java`: Tests thread-safe instantiation and query execution.

### Code Highlights
- Uses `volatile` and double-checked locking for thread-safe Singleton instantiation.
- `executeQuery()` simulates running SQL queries on the connection.
- The test spawns two threads to access the instance and verifies they get the same object.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `DatabaseConnection.java` and `SingletonTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac DatabaseConnection.java SingletonTest.java
     ```
   - Run the test:
     ```bash
     java SingletonTest
     ```

3. **Expected Output** (order may vary due to threading):
   ```
   DatabaseConnection initialized with: jdbc:mysql://localhost:3306/mydb
   Executing query: SELECT * FROM users on jdbc:mysql://localhost:3306/mydb
   Thread Thread-1 got instance: DatabaseConnection@...
   Executing query: SELECT * FROM users on jdbc:mysql://localhost:3306/mydb
   Thread Thread-2 got instance: DatabaseConnection@...
   Same instance? true
   ```

## Use Cases
- Managing a single database connection in a web application (e.g., Spring Boot).
- Centralizing configuration settings or logging services.
- Controlling access to shared resources like thread pools.

## Advantages
- Ensures a single instance, reducing resource usage.
- Provides a global access point for shared resources.
- Supports lazy initialization.

## Disadvantages
- Can introduce global state, complicating testing.
- Thread-safety mechanisms add complexity.
- Difficult to subclass or modify behavior.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Concurrency: https://docs.oracle.com/javase/tutorial/essential/concurrency/