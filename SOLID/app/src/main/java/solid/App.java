package solid;

import java.time.Duration;
import java.util.Set;
import employees.producers.Cook;
import employees.Accountant;
import employees.Employee;
import food.ingredients.Ingredient;
import food.ingredients.Lavash;
import food.ingredients.Vegetable;
import food.ingredients.meat.Meat;
import food.ingredients.meat.enums.MeatType;
import food.items.food.FoodMenuItem;
import food.recipes.Recipe;
import food.recipes.steps.OneTimeRecipeStep;
import food.recipes.steps.RecipeStep;
import food.recipes.steps.TimedRecipeStep;
import food.recipes.steps.enums.RecipeAction;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        getKebabRecipe();
        CookKebab();
    }

    public static Recipe getKebabRecipe() {
        Ingredient chicken = new Meat("Chicken Tighs", "Tender chicken tighs", MeatType.CHICKEN);
        Ingredient toamtoes = new Vegetable("Tomato", "Fresh Tomatos", true);
        Ingredient onions = new Vegetable("Onion", "Fresh Onions", true);
        Ingredient bellPepper = new Vegetable("Bell Pepper", "Fresh Bell Pepper", true);
        Ingredient lavash = new Lavash("Lavash", "Arabic lavash", false);
        RecipeStep grillChicken = new TimedRecipeStep(chicken, "Grill the chicken", RecipeAction.GRILL,
                Duration.ofMinutes(1));
        RecipeStep cutTomatoes = new OneTimeRecipeStep(lavash, "Cut the tomatoes", RecipeAction.CUT);
        RecipeStep cutOnions = new OneTimeRecipeStep(lavash, "Cut the onions", RecipeAction.CUT);
        RecipeStep unfoldLavash = new OneTimeRecipeStep(lavash, "Unfold the lavash", RecipeAction.UNFOLD);
        RecipeStep mixIngredients = new OneTimeRecipeStep(lavash, "Mix the ingredients", RecipeAction.MIX);
        RecipeStep wrapIngredients = new OneTimeRecipeStep(lavash, "Wrap the ingredients", RecipeAction.FOLD);
        Ingredient[] ingredients = { chicken, toamtoes, onions, bellPepper, lavash };
        RecipeStep[] steps = { grillChicken, cutTomatoes, cutOnions, unfoldLavash, mixIngredients, wrapIngredients };
        Recipe kebabRecipe = new Recipe("Kebab Recipe", ingredients, steps);
        return kebabRecipe;
    }

    public static void CookKebab() {
        Recipe kebabRecipe = getKebabRecipe();
        FoodMenuItem kebab = new FoodMenuItem("Kebab", "Tender chicken kebab", 50, kebabRecipe, 420);
        Set<FoodMenuItem> cookableItems = Set.of(kebab);
        Cook john = new Cook("John", 1000, cookableItems);
        john.giveRequest(kebab);
        john.giveRequest(kebab);
        john.work();
        Accountant accountant = new Accountant("Jane", 2000, null);
        accountant.addSubordinate(john);
        accountant.work();
    }
}
