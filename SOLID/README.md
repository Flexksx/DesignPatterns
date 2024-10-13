# SOLID Principles

## Author: Cretu Cristian 
## Group: FAF-223
----
## Theory

In software engineering, the SOLID principles are a set of design guidelines that help developers create more maintainable, understandable, and flexible software. These principles are intended to improve the design and architecture of software systems, making them easier to manage and extend over time.

The SOLID principles are:

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
## Objectives:

* Get familiar with SOLID principles in designing software.
* Implement 2 SOLID principles in a simple project.


## Implementation
To showcase the use of SOLID principles, I decided to create a simulation of a restaurant. 
Various parts of the restaurant can be implemented by respecting the SOLID principles in a way that makes our code easy to read, extend and develop upon.

### Single Responsibility Principle
There are people working at this restaurant. Since we want happy employees, we do not want our people having too many tasks to do, at least for now. We decide to hire a `Barman` whose sole responsibility is to serve drinks.
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
We may serve multiple dishes at a restaurant. All those are somewhat similar, so we can start with the most common thing. We can define an abstract class `MenuItem`
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

### Liskov Sybstitution Principle
It may become hard to manage people manually by telling them to work. That's why managers exist, so we can focus on other aspects of the restaurant. 
The `SubordinatesManager` is a utility class responsible for CRUD operations on employees some class has to manage. 
```java
package employees.director;

import java.util.HashSet;
import employees.Employee;
import employees.common.SubordinatesManager;

public class Manager implements Employee {
    private String name;
    private double salary;
    public SubordinatesManager subordinatesManager;

    public Manager(String name, double salary, HashSet<Employee> subordinates) {
        this.name = name;
        this.salary = salary;
        this.subordinatesManager = new SubordinatesManager(subordinates);
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void work() {
        System.out.println("Manager " + this.name
                + " is managing the team");
        for (Employee employee : this.subordinatesManager.getSubordinates()) {
            System.out.println("Manager " + this.name
                    + " is managing " + employee.getName());
            employee.work();
        }
    }
}
```
The `Manager` implements the `Employee` interface, which would allow us creating 10 layers of management in this restaurant. The role of a `Manager` is to delegate work to other `Employee` objects. 
Since any class that implements the `Employee` interface must implement the `work()` method, a `Manager` will be able to put any employee to work, either a cook, barman, accountant, or even another `Manager`
This is an example of the Liskov Substitution Principle - we allow a `Manager` call the `work()` method on employees without the `Manager` needing to know the concrete implementation or any details, and this will not break the system logic.

### Interface Segregation Principle
We can have different types of employees working in a restaurant. To ensure that they are following the SRP and the OCP, it would be useful to follow the Interface Segregation Principle. 
For example, we have the `Employee` interface:
```java
package employees;

public interface Employee {
    public String getName();

    public double getSalary();

    public void work();
}
```
which defines the most generalized *contract* each employee must adhere to. Since we have employees that serve people, we can name them `ProducingEmployee`, which will have a new method added to the base interface, `giveRequest`
```java
package employees.producers;

import employees.Employee;
import food.items.MenuItem;

public interface ProducingEmployee extends Employee {
    public void giveRequest(MenuItem menuItem);
}
```
This approach allows us to have the class `Accountant` that implements only the `Employee` interface, and the classes `Cook` and `Barman` will implement the `ProducingEmployee`. Thus an `Accountant` doesn't need to implement unnecessary for its' job methods. 
```java
public class Accountant implements Employee {
    private String name;
    private double salary;
    @Nullable
    private HashSet<Employee> subordinates;

    public Accountant(String name, double salary, HashSet<Employee> subordinates) {
        this.name = name;
        this.salary = salary;
        if (subordinates == null) {
            this.subordinates = new HashSet<>();
        } else {
            this.subordinates = new HashSet<>(subordinates);
        }
    }
```

### Dependency Inversion Principle
Following the previously used `Accountant` class, we can describe also the DIP. The `Accountant` class has methods used to pay salaries to other people - objects that implement the `Employee` interface. 
```java
package employees.accountant;

import java.util.HashSet;

import employees.Employee;

public class Accountant implements Employee {
    private String name;
    private double salary;
    public SubordinatesManager subordinates;

    public Accountant(String name, double salary, HashSet<Employee> subordinates) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new SubordinatesManager(subordinates);
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void paySalariesTo(Employee employee) {
        System.out.println("Paying " + employee.getName()
                + " $" + employee.getSalary());
    }

    @Override
    public void work() {
        System.out.println("I'm an accountant, I'm working");
        for (Employee employee : this.subordinates.getSubordinates()) {
            paySalariesTo(employee);
        }
        System.out.println("Paying myself $" + this.salary);
    }
}
```
This implementation follows the Dependency Inversion Principle (DIP) by ensuring that Accountant depends on the Employee interface (an abstraction), not concrete classes. The SubordinatesManager handles operations on employees, keeping Accountant decoupled from low-level details. 
This design allows for easy extension with new employee types, making the system flexible and maintaining adherence to the DIP by relying on abstractions rather than specific implementations.

## Conclusions / Screenshots / Results