package food.recipes.steps;

import javax.annotation.Nullable;

import food.ingredients.Ingredient;
import food.recipes.steps.enums.RecipeAction;

public interface RecipeStep {
    public Ingredient getIngredient();

    @Nullable
    public String getDescription();

    public RecipeAction getAction();
}
