package food.items;

public abstract class AbstractMenuItem implements MenuItem {
    protected String name;
    protected String description;
    protected double price;

    public AbstractMenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
