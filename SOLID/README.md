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
We may serve multiple dishes at a kebab place. All those are somewhat similar, so we can start with the most common thing. We can define an abstract class `MenuItem`
```java
package food.items;

public abstract class MenuItem {
    protected String name;
    protected String description;
    protected double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
```
Then we can use that to define the `FoodMenuItem` class that specializes in representing different dishes on our menu.
```java
package food.items.food;

import food.items.MenuItem;
import food.recipes.Recipe;

public class FoodMenuItem extends MenuItem {
    protected Recipe recipe;
    protected double weight;

    public FoodMenuItem(String name, String description, double price, Recipe recipe, double weight) {
        super(name, description, price);
        this.recipe = recipe;
        this.weight = weight;
    }

    public Recipe getRecipe() {
        return this.recipe;
    }

    public double getWeight() {
        return this.weight;
    }
}
```
and the `DrinkMenuItem` for items on our menu that are actually drinks.
```java
package food.items.drinks;

import food.items.MenuItem;

public class DrinkMenuItem extends MenuItem {
    protected double volume;

    public DrinkMenuItem(String name, String description, double price, double volume) {
        super(name, description, price);
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }
}
```
and we can go even further and extend a `DrinkMenuItem` to an `AlcoholicDrinkMenuItem`.
```java
package food.items.drinks;

public class AlcoholicDrinkMenuItem extends DrinkMenuItem {
    protected double alcoholPercentage;

    public AlcoholicDrinkMenuItem(String name, String description, double price, double volume,
            double alcoholPercentage) {
        super(name, description, price, volume);
        this.alcoholPercentage = alcoholPercentage;
    }

    public double getAlcoholPercentage() {
        return this.alcoholPercentage;
    }
}
```
This demonstrates that our system is open for extension - new types of menu items can be added by creating other specialized classes starting from the `MenuItem` abstract class, or extend upon other already specialized classes, like the `DrinkMenuItem` and `AlcoholicDrinkMenuItem`.
If we were to add a nullable `alcoholPercentage` field to the `DrinkMenuItem` class, we would jeopardize the flexibility of our system.
## Conclusions / Screenshots / Results