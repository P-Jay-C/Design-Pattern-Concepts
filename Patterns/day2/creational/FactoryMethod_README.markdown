# Factory Method Pattern

## Overview

The **Factory Method Pattern** is a **Creational** design pattern that defines an interface for creating an object but lets subclasses decide which class to instantiate. It promotes loose coupling by allowing a class to defer instantiation to subclasses.

## Purpose

- Provide a way to create objects without specifying the exact class.
- Allow subclasses to decide which class to instantiate.
- Support extensibility for adding new types without modifying existing code.

## Practice Task

**Task**: Implement a Factory Method for a `VehicleFactory` that creates different types of vehicles (`Car`, `Bike`). Create an abstract `Vehicle` class with a `drive()` method and concrete classes `Car` and `Bike`. Use the factory to create vehicles and test their `drive()` methods.

## Structure

- **Product**: The interface or abstract class for objects created (e.g., `Vehicle`).
- **Concrete Product**: Specific classes that implement the product (e.g., `Car`, `Bike`).
- **Creator**: An abstract class or interface defining the factory method (e.g., `VehicleFactory`).
- **Concrete Creator**: Subclasses that implement the factory method to create specific products (e.g., `CarFactory`, `BikeFactory`).

## Implementation

The provided Java implementation fulfills the practice task by:

- Defining `Vehicle` as an abstract class with a `drive()` method.
- Implementing `Car` and `Bike` as concrete vehicle classes.
- Creating `VehicleFactory` as an abstract class with a factory method `createVehicle()`.
- Implementing `CarFactory` and `BikeFactory` to create `Car` and `Bike` instances.
- Including `FactoryMethodTest.java` to demonstrate creating and using vehicles.

### Files

- `Vehicle.java`: Abstract class with `drive()` method.
- `Car.java`, `Bike.java`: Concrete vehicle implementations.
- `VehicleFactory.java`: Abstract factory with factory method.
- `CarFactory.java`, `BikeFactory.java`: Concrete factories.
- `FactoryMethodTest.java`: Tests the factory method pattern.

### Code Highlights

- `VehicleFactory` defines the abstract `createVehicle()` method.
- `CarFactory` and `BikeFactory` override `createVehicle()` to return specific vehicle types.
- The test creates factories and uses them to produce and drive vehicles.

## How to Run

1. **Prerequisites**:

   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:

   - Copy all Java files (`Vehicle.java`, `Car.java`, `Bike.java`, `VehicleFactory.java`, `CarFactory.java`, `BikeFactory.java`, `FactoryMethodTest.java`) into a Java project.

   - Compile the files:

     ```bash
     javac *.java
     ```

   - Run the test:

     ```bash
     java FactoryMethodTest
     ```

3. **Expected Output**:

   ```
   Driving a car
   Riding a bike
   ```

## Use Cases

- Creating different types of objects in a framework (e.g., UI components).
- Supporting multiple product families (e.g., document types in an editor).
- Enabling extensibility for new object types.

## Advantages

- Promotes loose coupling by abstracting object creation.
- Follows the Open/Closed Principle (extendable without modification).
- Simplifies adding new product types.

## Disadvantages

- Increases complexity with additional classes.
- May lead to many subclasses for each product type.
- Requires careful design to avoid tight coupling in factories.

## Further Reading

- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Java Abstract Classes: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html