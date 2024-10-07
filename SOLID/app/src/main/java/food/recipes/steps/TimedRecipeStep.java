package food.recipes.steps;

import food.ingredients.Ingredient;
import food.recipes.steps.enums.RecipeAction;

import java.time.Duration;

public class TimedRecipeStep extends OneTimeRecipeStep {
    private Duration duration;

    public TimedRecipeStep(Ingredient ingredient, String description, RecipeAction action, Duration duration) {
        super(ingredient, description, action);
        this.duration = duration;
    }

    public Duration getDuration() {
        return this.duration;
    }
}
