# Proxy Pattern

## Overview
The **Proxy Pattern** is a **Structural** design pattern that provides a surrogate or placeholder for another object to control access to it. It is used to add functionality like lazy loading, access control, or logging without modifying the original object.

## Purpose
- Control access to an object (e.g., lazy initialization, security).
- Add behavior (e.g., caching, logging) transparently.
- Reduce resource usage by deferring costly operations.

## Practice Task
**Task**: Implement a Proxy pattern for an `Image` system where a `ProxyImage` delays loading a high-resolution image until it’s displayed. Create an `Image` interface with a `display()` method, a `RealImage` class, and a `ProxyImage` to control access. Test by displaying the image multiple times to demonstrate lazy loading.

## Structure
- **Subject**: An interface defining the common operations (e.g., `Image`).
- **Real Subject**: The actual object being proxied (e.g., `RealImage`).
- **Proxy**: Controls access to the real subject and may add behavior (e.g., `ProxyImage`).
- **Client**: Interacts with the subject through the proxy.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Image` as an interface with a `display()` method.
- Implementing `RealImage` to load and display an image.
- Implementing `ProxyImage` to lazily instantiate `RealImage`.
- Including `ProxyTest.java` to test lazy loading.

### Files
- `Image.java`: Interface for images.
- `RealImage.java`: Concrete image class.
- `ProxyImage.java`: Proxy controlling image access.
- `ProxyTest.java`: Tests the proxy pattern.

### Code Highlights
- `ProxyImage` delays `RealImage` creation until `display()` is called.
- `RealImage` simulates costly image loading.
- The test displays the image twice, loading it only once.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `Image.java`, `RealImage.java`, `ProxyImage.java`, and `ProxyTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac Image.java RealImage.java ProxyImage.java ProxyTest.java
     ```
   - Run the test:
     ```bash
     java ProxyTest
     ```

3. **Expected Output**:
   ```
   Loading image: photo.jpg
   Displaying image: photo.jpg
   Displaying image: photo.jpg
   ```

## Use Cases
- Lazy loading of resources (e.g., images, database records).
- Access control in secure systems.
- Logging or monitoring method calls.

## Examples in Java and Spring Boot
- **Java**:
  - **Proxy Classes in Reflection**: Java’s `java.lang.reflect.Proxy` creates dynamic proxies for interfaces, allowing interception of method calls (e.g., for logging or validation).
  - **JDBC DataSource**: The `DataSource` interface in `java.sql` is often implemented by proxies that manage connection pooling, delaying actual database connections until needed.
- **Spring Boot**:
  - **AOP Proxies**: Spring’s Aspect-Oriented Programming (AOP) uses proxies to implement cross-cutting concerns like logging, security, or transaction management. For example, `@Transactional` creates a proxy around a service bean to manage database transactions.
  - **Lazy Initialization**: Spring’s `@Lazy` annotation enables lazy loading of beans, where a proxy is used to defer bean creation until first use, similar to `ProxyImage`.
  - **Feign Clients**: Spring Cloud’s Feign clients use proxies to handle HTTP requests, abstracting network communication and providing fallback mechanisms.

## Advantages
- Controls access without modifying the real subject.
- Supports lazy loading and resource optimization.
- Facilitates adding behavior transparently.

## Disadvantages
- Increases complexity with additional proxy classes.
- May introduce performance overhead for simple operations.
- Requires careful design to avoid proxy misuse.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring AOP: https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop