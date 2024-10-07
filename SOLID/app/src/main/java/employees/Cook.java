package employees;

import food.items.food.FoodMenuItem;
import food.items.MenuItem;
import food.recipes.steps.RecipeStep;
import food.recipes.steps.TimedRecipeStep;

import java.util.LinkedList;
import java.util.Queue;

public class Cook implements Employee {
    private String name;
    private FoodMenuItem[] cookableItems;
    private Queue<FoodMenuItem> cookingQueue;

    public Cook(String name, FoodMenuItem[] cookableItems) {
        this.name = name;
        this.cookableItems = cookableItems;
        this.cookingQueue = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public FoodMenuItem[] canCook() {
        return cookableItems;
    }

    @Override
    public void giveRequest(MenuItem item) {
        if (item == null) {
            System.out.println("Cannot add null item to the queue.");
        } else if (!(item instanceof FoodMenuItem)) {
            System.out.println("Cannot add non-food item to the queue.");
        } else {
            System.out.println(item.getName() + " has been added to " + this.name + "'s cooking queue.");
            cookingQueue.add((FoodMenuItem) item);
        }
    }

    private void cookNextItem() {
        if (cookingQueue.isEmpty()) {
            System.out.println(this.name + " has no items to cook.");
            return;
        }

        FoodMenuItem itemToCook = cookingQueue.poll();
        if (itemToCook != null) {
            boolean canCook = false;
            for (FoodMenuItem menuItem : cookableItems) {
                if (menuItem.equals(itemToCook)) {
                    canCook = true;
                    break;
                }
            }

            if (!canCook) {
                System.out.println(this.name + " cannot cook " + itemToCook.getName() + ".");
            } else {
                System.out.println(this.name + " is cooking " + itemToCook.getName() + ".");
                RecipeStep[] steps = itemToCook.getRecipe().getSteps();
                for (int i = 0; i < steps.length; i++) {
                    RecipeStep step = steps[i];
                    if (step instanceof TimedRecipeStep) {
                        TimedRecipeStep timedStep = (TimedRecipeStep) step;
                        System.out.println("Step " + (i + 1) + ": " + timedStep.getDescription() + " for "
                                + timedStep.getDuration().toSeconds() + " seconds.");
                    } else {
                        System.out.println("Step " + (i + 1) + ": " + step.getDescription());
                    }
                }
            }
        }
    }

    @Override
    public void work() {
        while (!cookingQueue.isEmpty()) {
            this.cookNextItem();
        }
    }
}
