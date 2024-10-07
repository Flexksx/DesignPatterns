package food.recipes.steps;

import food.ingredients.Ingredient;
import food.recipes.steps.enums.RecipeAction;

public class OneTimeRecipeStep implements RecipeStep {
    protected Ingredient ingredient;
    protected String description;
    protected RecipeAction action;

    public OneTimeRecipeStep(Ingredient ingredient, String description, RecipeAction action) {
        this.ingredient = ingredient;
        this.description = description;
        this.action = action;
    }

    @Override
    public RecipeAction getAction() {
        return this.action;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Ingredient getIngredient() {
        return this.ingredient;
    }

}
