package practice.designpatterns.DecoratorPattern;

public class Decaf extends Beverage {
    public Decaf() {
        description = "decaf";
    }

    public double cost() {
        return 1.50;
    }

}
