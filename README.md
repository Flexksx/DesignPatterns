# Design Patterns Labs
This is a repository for the laboratory works assigned for the Design Patterns course. 
## [Lab 0 - SOLID](https://github.com/Flexksx/Design-Patterns-Labs/tree/main/SOLID)
In this lab work, I implemented the SOLID principles in a Java-based restaurant simulation. 
The project showcased how these principles lead to cleaner, maintainable, and flexible code, demonstrating concepts like single responsibility, open-closed design, and dependency inversion through the roles of various restaurant employees.

## [Lab 1 - Creational Patterns](https://github.com/Flexksx/Design-Patterns-Labs/tree/main/CreationalPatterns)
Made a simple coffee shop simulation that used the `Builder`, `Factory`, `Singleton` and `Prototype` patterns to ease the brewing of different coffee drinks based on customer preferences and requests.

## [Lab 2 - Structural Patterns](https://github.com/Flexksx/DesignPatterns/tree/main/StructuralPatterns)
Modified the logic of the Lab 1 so that it will not rely that much on Creational Patterns, instead making more use of Structure Patterns to ensure better flexibility and scalability of the project. Used the `Decorator`, `Flyweight`, `Composite` and `Bridge` patterns to make the coffee easier to brew and add the posibility of making composite orders that have multiple items.
## [Lab 3 - Behavioral Patterns](https://github.com/Flexksx/DesignPatterns/tree/main/BehavioralPatterns)
Structured the whole system in a single client and added a `StatefulEmployee` abstract class that allows creating derived classes, like the `Barista` class, which are employees that implement the State design pattern to make use of different behavior in special cases. 
