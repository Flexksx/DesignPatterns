package main.java.models;

public interface MenuItem {
    public String getName();

    public double getPrice();

    public String getDescription();

    public String getCategory();

    public void setName(String name);

    public void setPrice(double price);

    public void setDescription(String description);

    public void setCategory(String category);
}
