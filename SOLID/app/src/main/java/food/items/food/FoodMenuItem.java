package food.items.food;

import food.MenuItem;
import food.items.AbstractMenuItem;
import food.recipes.Recipe;

public class FoodMenuItem extends AbstractMenuItem implements MenuItem {
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
