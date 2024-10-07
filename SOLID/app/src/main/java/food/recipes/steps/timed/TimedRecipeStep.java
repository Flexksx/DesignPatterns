package food.recipes.steps.timed;

import food.recipes.steps.RecipeStep;
import java.time.Duration;

public interface TimedRecipeStep extends RecipeStep {
    public Duration getDuration();

}
