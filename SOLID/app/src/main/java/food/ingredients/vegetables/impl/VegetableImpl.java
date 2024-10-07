package food.ingredients.vegetables.impl;

import food.ingredients.AbstractIngredient;
import food.ingredients.vegetables.Vegetable;

public class VegetableImpl extends AbstractIngredient implements Vegetable {
    private boolean isOrganic;

    public VegetableImpl(String name, String description, boolean isOrganic) {
        super(name, description);
        this.isOrganic = isOrganic;
    }

    @Override
    public boolean isOrganic() {
        return isOrganic;
    }

}
