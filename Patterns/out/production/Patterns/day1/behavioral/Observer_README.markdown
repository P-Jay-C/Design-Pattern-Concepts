# Observer Pattern

## Overview

The **Observer Pattern** is a **Behavioral** design pattern that defines a one-to-many dependency between objects. When the state of one object (subject) changes, all its dependent objects (observers) are notified and updated automatically.

## Purpose

- Establish a subscription mechanism to notify multiple objects of state changes.
- Decouple the subject from its observers, allowing dynamic addition/removal of observers.
- Support broadcast communication.

## Structure

- **Subject**: Maintains a list of observers and notifies them of state changes (e.g., `NewsAgency`).
- **Observer Interface**: Defines the update method that observers implement (e.g., `NewsChannel`).
- **Concrete Observers**: Implement the observer interface to handle updates (e.g., `TVNewsChannel`).
- **Client**: Sets up the subject and observers, triggering state changes.

## Implementation

The provided Java implementation includes:

- `NewsAgency.java`: The subject that manages headlines and notifies observers.
- `NewsChannel.java`: The observer interface.
- `TVNewsChannel.java`: A concrete observer that displays headlines.
- `ObserverTest.java`: A test class to demonstrate the observer pattern.

### Files

- `NewsAgency.java`: Manages observers and headline updates.
- `NewsChannel.java`: Defines the `update` method for observers.
- `TVNewsChannel.java`: Implements `NewsChannel` to print headlines.
- `ObserverTest.java`: Tests subscribing, notifying, and unsubscribing observers.

### Code Highlights

- `NewsAgency` maintains a list of `NewsChannel` observers and notifies them when a new headline is set.
- `TVNewsChannel` implements the `NewsChannel` interface to display received headlines.
- The test demonstrates subscribing two channels, publishing headlines, and unsubscribing one channel.

## How to Run

1. **Prerequisites**:

   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:

   - Copy `NewsAgency.java`, `NewsChannel.java`, `TVNewsChannel.java`, and `ObserverTest.java` into a Java project.

   - Compile the files:

     ```bash
     javac NewsAgency.java NewsChannel.java TVNewsChannel.java ObserverTest.java
     ```

   - Run the test:

     ```bash
     java ObserverTest
     ```

3. **Expected Output**:

   ```
   CNN received headline: Breaking: Major event reported!
   BBC received headline: Breaking: Major event reported!
   CNN received headline: Update: Event details released!
   ```

## Use Cases

- Event handling systems (e.g., GUI frameworks).
- Real-time data feeds (e.g., stock market updates).
- Publish-subscribe systems (e.g., news or messaging apps).

## Advantages

- Promotes loose coupling between subject and observers.
- Supports dynamic addition/removal of observers.
- Enables broadcasting to multiple objects.

## Disadvantages

- Can lead to memory leaks if observers are not properly unsubscribed.
- Notification overhead may impact performance with many observers.
- Observers may become dependent on subject state.

## Further Reading

- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Observable/Observer (deprecated) vs. Custom Implementation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Observable.html