package employees.producers;

import employees.Employee;
import food.items.MenuItem;
import food.items.drinks.DrinkMenuItem;

public class Barman extends AbstractProducingEmployee implements Employee {
    public Barman(String name, double salary) {
        super(name, salary);
    }


    @Override
    public void giveRequest(MenuItem menuItem) {
        if (menuItem == null) {
            throw new IllegalArgumentException("Menu item cannot be null");
        } else if (!(menuItem instanceof DrinkMenuItem)) {
            throw new IllegalArgumentException("Barman can only serve drinks");
        }
        System.out.println("I'm a barman, I'm giving" + menuItem.getName());
    }

    @Override
    public void work() {
        System.out.println("I'm a barman, I'm working");
    }

}
