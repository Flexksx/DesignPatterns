package food.items.drinks;

import food.items.AbstractMenuItem;

public class DrinkMenuItem extends AbstractMenuItem {
    protected double volume;

    public DrinkMenuItem(String name, String description, double price, double volume) {
        super(name, description, price);
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }

}