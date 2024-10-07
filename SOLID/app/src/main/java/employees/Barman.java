package employees;

import food.items.MenuItem;
import food.items.drinks.DrinkMenuItem;

public class Barman implements Employee {
    private String name;

    public Barman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
