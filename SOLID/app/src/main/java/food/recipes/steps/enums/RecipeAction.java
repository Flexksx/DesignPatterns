package food.recipes.steps.enums;

public enum RecipeAction {
    CHOP("Chop"),
    MIX("Mix"),
    BOIL("Boil"),
    FRY("Fry"),
    BAKE("Bake"),
    GRILL("Grill"),
    ADD("Add"),
    REMOVE("Remove"),
    WAIT("Wait");

    private final String value;

    RecipeAction(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
