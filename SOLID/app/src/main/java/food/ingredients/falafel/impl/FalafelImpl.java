package food.ingredients.falafel.impl;

import food.ingredients.AbstractIngredient;
import food.ingredients.falafel.Falafel;

public class FalafelImpl extends AbstractIngredient implements Falafel {
    private boolean isGlutenFree;

    public FalafelImpl(String name, String description, boolean isGlutenFree) {
        super(name, description);
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public boolean isGlutenFree() {
        return isGlutenFree;
    }
}
