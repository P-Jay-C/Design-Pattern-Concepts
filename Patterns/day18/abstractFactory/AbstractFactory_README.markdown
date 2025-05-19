# Abstract Factory Pattern

## Overview
The **Abstract Factory Pattern** is a **Creational** design pattern that provides an interface for creating families of related objects without specifying their concrete classes. It ensures consistency across related products.

## Purpose
- Create families of related objects.
- Ensure product compatibility.
- Support multiple product variants.

## Practice Task
**Task**: Implement an Abstract Factory pattern for a `GameAssetFactory` that creates game assets (e.g., `Character`, `Weapon`) for different game genres (e.g., `Fantasy`, `SciFi`). Define an abstract `GameAssetFactory` with concrete factories for each genre and asset interfaces. Test by creating and using assets for different genres.

## Structure
- **Abstract Product**: Interfaces for product types (e.g., `Character`, `Weapon`).
- **Concrete Product**: Classes implementing product interfaces (e.g., `FantasyCharacter`, `SciFiWeapon`).
- **Abstract Factory**: An interface for creating products (e.g., `GameAssetFactory`).
- **Concrete Factory**: Implements the factory to create a family of products (e.g., `FantasyFactory`, `SciFiFactory`).
- **Client**: Uses the factory to create products.

## Implementation
The provided Java implementation fulfills the practice task by:
- Defining `Character` and `Weapon` as abstract product interfaces.
- Implementing concrete products (`FantasyCharacter`, `FantasyWeapon`, `SciFiCharacter`, `SciFiWeapon`).
- Creating `GameAssetFactory` as the abstract factory interface.
- Implementing `FantasyFactory` and `SciFiFactory` as concrete factories.
- Including `AbstractFactoryTest.java` to test asset creation.

### Files
- `Character.java`, `Weapon.java`: Abstract product interfaces.
- `FantasyCharacter.java`, `FantasyWeapon.java`, `SciFiCharacter.java`, `SciFiWeapon.java`: Concrete products.
- `GameAssetFactory.java`: Abstract factory interface.
- `FantasyFactory.java`, `SciFiFactory.java`: Concrete factories.
- `AbstractFactoryTest.java`: Tests the abstract factory pattern.

### Code Highlights
- `GameAssetFactory` defines methods to create `Character` and `Weapon`.
- Concrete factories produce genre-consistent assets.
- The test creates and uses assets from different factories.

## How to Run
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - A Java IDE (e.g., IntelliJ, Eclipse) or command-line environment.

2. **Steps**:
   - Copy all Java files into a Java project under a directory (e.g., `AbstractFactory_Cycle4_Game`).
   - Compile the files:
     ```bash
     javac *.java
     ```
   - Run the test:
     ```bash
     java AbstractFactoryTest
     ```

3. **Expected Output**:
   ```
   Fantasy Character swings sword
   Using magical staff
   SciFi Character fires laser gun
   Using plasma rifle
   ```

## Use Cases
- Creating game assets for different genres.
- Generating UI components for themes.
- Producing platform-specific resources.

## Examples in Java and Spring Boot
- **Java**:
  - **Toolkit**: `java.awt.Toolkit` creates platform-specific UI components.
  - **JAXP**: `javax.xml.parsers.DocumentBuilderFactory` creates XML parsers for different implementations.
- **Spring Boot**:
  - **Spring Cloud Connectors**: `ServiceConnectorCreator` creates cloud service connectors for providers.
  - **Spring Data Factory**: Repository factories create repositories for data stores (e.g., JPA, MongoDB).
  - **WebClient Builder**: Spring WebFlux’s `WebClient.Builder` creates clients with consistent configurations.

## Advantages
- Ensures product consistency.
- Supports multiple product families.
- Promotes loose coupling.

## Disadvantages
- Increases class count.
- Complex to extend for new products.
- Requires upfront family design.

## Further Reading
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma et al.
- Spring Cloud: https://docs.spring.io/spring-cloud/docs/current/reference/html/