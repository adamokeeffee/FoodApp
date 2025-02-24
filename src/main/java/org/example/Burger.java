package org.example;

public class Burger implements Food {

    String Name;

    double Price;

    String Description;

    public Burger(String name, double price, String description) {
        this.Name = name;
        this.Price = price;
        this.Description = description;
    }

    @Override
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
