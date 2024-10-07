package food.recipes.steps.onetime.impl;

import food.ingredients.Ingredient;
import food.recipes.steps.AbstractRecipeStep;
import food.recipes.steps.enums.RecipeAction;
import food.recipes.steps.onetime.OneTimeRecipeStep;

public class OneTimeRecipeStepImpl extends AbstractRecipeStep implements OneTimeRecipeStep {
    public OneTimeRecipeStepImpl(Ingredient ingredient, String description, RecipeAction action) {
        super(ingredient, description, action);
    }

}
