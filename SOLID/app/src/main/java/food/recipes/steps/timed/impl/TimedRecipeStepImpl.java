package food.recipes.steps.timed.impl;

import java.time.Duration;

import food.ingredients.Ingredient;
import food.recipes.steps.AbstractRecipeStep;
import food.recipes.steps.enums.RecipeAction;
import food.recipes.steps.timed.TimedRecipeStep;

public class TimedRecipeStepImpl extends AbstractRecipeStep implements TimedRecipeStep {
    private Duration duration;

    public TimedRecipeStepImpl(Ingredient ingredient, String description, RecipeAction action, Duration duration) {
        super(ingredient, description, action);
        this.duration = duration;
    }

    @Override
    public Duration getDuration() {
        return this.duration;
    }

}
