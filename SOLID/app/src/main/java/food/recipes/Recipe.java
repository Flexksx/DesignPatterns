package food.recipes;

import food.ingredients.Ingredient;
import food.recipes.steps.RecipeStep;

public class Recipe {
    private String name;
    private Ingredient[] ingredients;
    private RecipeStep[] steps;

    public Recipe(String name, Ingredient[] ingredients, RecipeStep[] steps) {
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public RecipeStep[] getSteps() {
        return steps;
    }
}
