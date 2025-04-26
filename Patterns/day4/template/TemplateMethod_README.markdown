# Template Method Pattern

## Overview
The **Template Method Pattern** is a **Behavioral** design pattern that defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It allows subclasses to redefine certain steps of the algorithm without changing its structure.

## Purpose
- Define a common algorithm structure while allowing customization of specific steps.
- Promote code reuse for shared logic.
- Ensure the algorithm’s sequence remains consistent across implementations.

## Practice Task
**Task**: Implement a Template Method pattern for a `DataProcessor` that processes data files in different formats (e.g., `CSV`, `JSON`). Create an abstract `DataProcessor` class with a template method `processData()`, and concrete classes `CSVProcessor` and `JSONProcessor` to handle specific formats. Test by processing sample CSV and JSON data.

## Structure
- **Abstract Class**: Defines the template method and abstract steps (e.g., `DataProcessor`).
- **Template Method**: The method containing the algorithm’s skeleton (e.g., `processData()`).
- **Concrete Class**: Implements the abstract steps for specific behavior (e.g., `CSVProcessor`, `JSONProcessor`).
- **Client**: Invokes the template method on concrete classes.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `DataProcessor` as an abstract class with a `processData()` template method.
- Implementing `CSVProcessor` and `JSONProcessor` to handle CSV and JSON data processing.
- Including `TemplateMethodTest.java` to demonstrate processing sample data.

### Files
- `DataProcessor.java`: Abstract class with template method.
- `CSVProcessor.java`, `JSONProcessor.java`: Concrete processors for CSV and JSON.
- `TemplateMethodTest.java`: Tests the template method pattern.

### Code Highlights
- `processData()` defines the algorithm steps: `readData()`, `parseData()`, `saveData()`.
- `saveData()` is a common step implemented in the abstract class.
- `CSVProcessor` and `JSONProcessor` customize `readData()` and `parseData()`.
- The test processes sample CSV and JSON data.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `DataProcessor.java`, `CSVProcessor.java`, `JSONProcessor.java`, and `TemplateMethodTest.java` into a Java project.
   - Compile the files:
     ```bash
     javac DataProcessor.java CSVProcessor.java JSONProcessor.java TemplateMethodTest.java
     ```
   - Run the test:
     ```bash
     java TemplateMethodTest
     ```

3. **Expected Output**:
   ```
   Reading CSV data: name,age\nJohn,30
   Parsing CSV data: name,age\nJohn,30
   Saving data to database
   Reading JSON data: {"name":"Jane","age":25}
   Parsing JSON data: {"name":"Jane","age":25}
   Saving data to database
   ```

## Use Cases
- Processing different data formats with a common workflow (e.g., file parsers).
- Implementing algorithms with invariant and variant steps (e.g., game loops).
- Standardizing processes in frameworks (e.g., Spring Boot lifecycle methods).

## Advantages
- Promotes code reuse for shared algorithm steps.
- Ensures consistent algorithm structure across subclasses.
- Simplifies extending the algorithm with new implementations.

## Disadvantages
- Limits flexibility if the algorithm structure cannot be changed.
- Increases complexity with additional abstract classes.
- May lead to many subclasses for minor variations.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Abstract Classes: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html