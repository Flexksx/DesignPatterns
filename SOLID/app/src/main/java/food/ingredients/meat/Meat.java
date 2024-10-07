package food.ingredients.meat;

import food.ingredients.Ingredient;
import food.ingredients.meat.enums.MeatType;

/**
 * Meat
 */
public interface Meat extends Ingredient {
    public MeatType getMeatType();
}
