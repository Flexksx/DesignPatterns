package food.ingredients;

public abstract class AbstractIngredient implements Ingredient {
    private String name;
    private String description;

    public AbstractIngredient(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
