package food.ingredients.meat.impl;

import food.ingredients.AbstractIngredient;
import food.ingredients.meat.Meat;
import food.ingredients.meat.enums.MeatType;

public class MeatImpl extends AbstractIngredient implements Meat {
    private MeatType meatType;

    public MeatImpl(String name, String description, MeatType meatType) {
        super(name, description);
        this.meatType = meatType;
    }

    @Override
    public MeatType getMeatType() {
        return meatType;
    }
}
