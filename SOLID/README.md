# SOLID Principles

## Author: Cretu Cristian 
----
## Objectives:

* Get familiar with SOLID principles in designing software.
* Implement 2 SOLID principles in a simple project.


## Used SOLID Principles: 

* Single Responsibility Principle
  * *There should never be more than one reason for a class to change.*
* Open-Closed Principle.
  * *Software entities should be open for extension, but closed for modification.*
* Liskov Substitution Principle.
  * *Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.*
* Interface Segregation Principle
  * *Clients should not be forced to depend upon interfaces that they do not use.*
* Dependency Inversion Principle
  * *Depend upon abstractions, [not] concretes.*


## Implementation
To showcase the use of SOLID principles, I decided to create a simulation of a kebab place. 
Various parts of the kebab place can be implementet by respecting the SOLID principles in a way that makes our code easy to read, extend and develop upon.

### Single Responsibility Principle
There are people working at this kebab place. Since we want happy employees, we do not want our people having too many tasks to do, at least for now. We decide to hire a `Barman` whose sole responsibility is to serve drinks.
```java
package employees.producers;

import food.items.MenuItem;
import food.items.drinks.DrinkMenuItem;

public class Barman extends AbstractProducingEmployee {
    public Barman(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void giveRequest(MenuItem menuItem) {
        if (menuItem == null) {
            System.err.println("Menu item cannot be null");
        } else if (!(menuItem instanceof DrinkMenuItem)) {
            System.err.println("Barman can only serve drinks");
        } else {
            System.out.println("I'm a barman, I'm giving you some " + menuItem.getName());
        }
    }

    @Override
    public void work() {
        System.out.println("I'm a barman, I'm working");
    }
}
```
This is a good example of SRP, since it focuses on the Barman's sole responsibility of serving drinks. It also adds a safety check and handles cases when a barman is asked to serve something other than a drink.

### Open-Closed Principle
We may serve multiple dishes at a kebab place. All those are somewhat similar, so we can start with the most common thing. We can define an interface `MenuItem`
```java
package food.items;

public interface MenuItem {
    public String getName();

    public String getDescription();

    public double getPrice();
}
```

## Conclusions / Screenshots / Results