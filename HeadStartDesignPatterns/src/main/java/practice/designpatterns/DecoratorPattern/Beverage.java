package practice.designpatterns.DecoratorPattern;

public abstract class Beverage {
    String description = "Undefined description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
