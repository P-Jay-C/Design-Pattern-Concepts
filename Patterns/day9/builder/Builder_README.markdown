# Builder Pattern

## Overview
The **Builder Pattern** is a **Creational** design pattern that separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It is ideal for objects with many optional attributes or complex setup steps.

## Purpose
- Simplify object creation with many parameters.
- Provide a fluent interface for configuration.
- Ensure immutability of the final object.

## Practice Task
**Task**: Implement a Builder pattern for a `Pizza` class that constructs pizzas with various toppings, sizes, and crust types. Create a `PizzaBuilder` to configure the pizza step-by-step and a `Pizza` class to hold the final state. Test by building different pizzas and displaying their details.

## Structure
- **Product**: The complex object being built (e.g., `Pizza`).
- **Builder**: A class or inner class that constructs the product step-by-step (e.g., `PizzaBuilder`).
- **Director**: (Optional) Coordinates the builder (not used here for simplicity).
- **Client**: Uses the builder to create the product.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Pizza` as the product with size, crust, and toppings.
- Implementing `PizzaBuilder` as a static inner class with fluent methods.
- Including `BuilderTest.java` to test building different pizzas.

### Files
- `Pizza.java`: Product class with inner `PizzaBuilder`.
- `BuilderTest.java`: Tests the builder pattern.

### Code Highlights
- `PizzaBuilder` provides fluent methods (`setSize`, `setCrust`, `addTopping`) for configuration.
- `Pizza` has a private constructor, only accessible via the builder.
- The test builds two pizzas with different configurations.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy `Pizza.java` and `BuilderTest.java` into a Java project under a directory (e.g., `Builder_Cycle2_Pizza`).
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java BuilderTest
     ```

3. **Expected Output**:
   ```
   Pizza: Size=Large, Crust=Thin, Toppings=[Pepperoni, Mushrooms]
   Pizza: Size=Medium, Crust=Stuffed, Toppings=[Cheese]
   ```

## Use Cases
- Configuring complex objects like orders or configurations.
- Building immutable objects with many optional fields.
- Creating domain-specific fluent APIs.

## Examples in Java and Spring Boot
- **Java**:
  - **StringBuilder**: The `java.lang.StringBuilder` class uses a builder-like approach, allowing chained `append` calls to construct a string.
  - **OkHttp Request**: In the OkHttp library, `Request.Builder` configures HTTP requests with methods like `url`, `header`, and `build`.
- **Spring Boot**:
  - **RestTemplateBuilder**: Spring’s `RestTemplateBuilder` configures `RestTemplate` instances with options like timeouts and interceptors, using a fluent API.
  - **WebTestClient.Builder**: In Spring WebFlux, `WebTestClient.bindToServer().baseUrl().build()` uses a builder to set up test clients.
  - **JPA Entity Configuration**: Spring Data JPA’s `@Query` annotations and `CriteriaBuilder` allow building complex queries fluently, similar to a builder pattern.

## Advantages
- Simplifies construction of complex objects.
- Supports immutability and fluent interfaces.
- Reduces constructor parameter overload.

## Disadvantages
- Increases code complexity with additional classes.
- Requires careful design to avoid partial construction.
- May be overkill for simple objects.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring RestTemplate: https://docs.spring.io/spring-framework/docs/current/reference/html/integration.html#rest-resttemplate